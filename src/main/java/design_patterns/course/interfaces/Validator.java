package design_patterns.course.interfaces;

import design_patterns.course.models.Person;

import java.util.function.Supplier;

public interface Validator {

    ValidatorSupplier on(Person person);

    default Validator thenValidate(Predicate<Person> predicate, String errorMessage) {
        return p -> {

            try {
                on(p).validate();
                if (predicate.test(p)) {
                    return () -> p;
                } else {
                    return () -> {
                        var validationException = new ValidationException("Object is not valid");
                        validationException.addSuppressed(new IllegalArgumentException(errorMessage));
                        throw validationException;
                    };
                }
            } catch (ValidationException validationException) {
                if (!predicate.test(p)) {
                    validationException.addSuppressed(new IllegalArgumentException(errorMessage));
                }
                return () -> {throw validationException;};
            }

        };
    }

    static Validator validate(Predicate<Person> predicate, String errorMessage) {
        return p -> {
            if (predicate.test(p)) {
                return () -> p;
            } else {
                return () -> {
                    var validationException = new ValidationException("Object is not valid");
                    validationException.addSuppressed(new IllegalArgumentException(errorMessage));
                    throw validationException;
                };
            }

        };
    }

    interface ValidatorSupplier extends Supplier<Person> {
        default Person validate() {
            return get();
        }
    }

    static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }
}
