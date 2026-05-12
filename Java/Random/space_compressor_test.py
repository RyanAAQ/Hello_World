from unittest import TestCase
from space_compressor import spaces

class TestSpaces(TestCase):

    def test_that_spaces_are_converted(self):
        actual = spaces("bl ah")
        expected = "bl-ah"
        self.assertEqual(actual, expected)
