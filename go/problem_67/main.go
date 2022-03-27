package main

import (
	"fmt"
	"strconv"
)

func main() {

	result := addBinary(
		"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
		"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011",
	)
	fmt.Print(result)
}

func addBinary(a string, b string) string {
	lenA := len(a)
	lenB := len(b)

	i := lenA - 1
	j := lenB - 1

	var output string
	var sum int
	carry := 0
	for i >= 0 && j >= 0 {
		first := int(a[i] - '0')
		second := int(b[j] - '0')

		sum, carry = binarySum(first, second, carry)

		output = strconv.Itoa(sum) + output
		i = i - 1
		j = j - 1
	}

	for i >= 0 {
		first := int(a[i] - '0')

		sum, carry = binarySum(first, 0, carry)

		output = strconv.Itoa(sum) + output
		i = i - 1

	}

	for j >= 0 {
		second := int(b[j] - '0')

		sum, carry = binarySum(0, second, carry)

		output = strconv.Itoa(sum) + output
		j = j - 1
	}

	if carry > 0 {
		output = strconv.Itoa(1) + output
	}

	return output
}

func binarySum(a, b, carry int) (int, int) {
	output := a + b + carry

	if output == 0 {
		return 0, 0
	}

	if output == 1 {
		return 1, 0
	}

	if output == 2 {
		return 0, 1
	}

	if output == 3 {
		return 1, 1
	}

	return 0, 0
}
