from unittest import TestCase
from thriple_threat import triple

class TestNumberOfLetters(TestCase):

    def test_that_the_letters_are_tripled(self):
        actual = triple("code")
        expected = "cccooodddeee"
        self.assertEqual(actual, expected)
