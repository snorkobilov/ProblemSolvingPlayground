package algorithm_book;

import algorithm_book.arrays_and_strings.UniqueCharacters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {
    UniqueCharacters uniqueCharacters;

    @BeforeEach
    void setUp() {
       uniqueCharacters = new UniqueCharacters();
    }

    @Test
    public void isUniqueReturnsFalse(){
        boolean inname = uniqueCharacters.isUnique("Innama");
        assertFalse(inname);
    }

    @Test
    public void isUniqueReturnsTrue(){
        boolean inname = uniqueCharacters.isUnique("Uniqe");
        assertTrue(inname);
    }

    @Test
    public void isUniqueNoDataStructureReturnsFalse(){
        boolean inname = uniqueCharacters.isUniqueNoDataStructure("Innama");
        assertFalse(inname);
    }

    @Test
    public void isUniqueNoDataStructureReturnsTrue(){
        boolean inname = uniqueCharacters.isUniqueNoDataStructure("Uniqe");
        assertTrue(inname);
    }

    @Test
    public void isUniqueWithArraysReturnsFalse(){
        boolean inname = uniqueCharacters.isUniqueWithArrays("Innama");
        assertFalse(inname);
    }

    @Test
    public void isUniqueWithArraysReturnsTrue(){
        boolean inname = uniqueCharacters.isUniqueWithArrays("Uniqe");
        assertTrue(inname);
    }
}