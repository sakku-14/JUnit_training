package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void fizzBuzz() {
        assertAll(
                () -> assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)),
                () -> assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30)),
                () -> assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45)),
                () -> assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(90))
        );
    }

    @Test
    void fizz() {
        assertAll(
                () -> assertEquals("Fizz", FizzBuzz.fizzBuzz(3)),
                () -> assertEquals("Fizz", FizzBuzz.fizzBuzz(12)),
                () -> assertEquals("Fizz", FizzBuzz.fizzBuzz(18)),
                () -> assertEquals("Fizz", FizzBuzz.fizzBuzz(33))
        );
    }

    @Test
    void buzz() {
        assertAll(
                () -> assertEquals("Buzz", FizzBuzz.fizzBuzz(5)),
                () -> assertEquals("Buzz", FizzBuzz.fizzBuzz(10)),
                () -> assertEquals("Buzz", FizzBuzz.fizzBuzz(20)),
                () -> assertEquals("Buzz", FizzBuzz.fizzBuzz(35))
        );
    }

    @Test
    void number() {
        assertAll(
                () -> assertEquals("2", FizzBuzz.fizzBuzz(2)),
                () -> assertEquals("7", FizzBuzz.fizzBuzz(7)),
                () -> assertEquals("11", FizzBuzz.fizzBuzz(11)),
                () -> assertEquals("14", FizzBuzz.fizzBuzz(14))
        );
    }


}