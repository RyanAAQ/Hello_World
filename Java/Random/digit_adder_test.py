from unittest import TestCase
from digit_adder import (add)

class TestSum(TestCase):

    def test_that_it_returns_the_sum(self):
        actual = add("a1b2c3")
        expected = 6
        self.assertEqual(actual, expected)
