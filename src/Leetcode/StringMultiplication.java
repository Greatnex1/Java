package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMultiplication {

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> subsets = new ArrayList<>();
            List<Integer> currentSubset = new ArrayList<>();

            subsetsWithDupHelper(subsets, currentSubset, nums, 0);
            return subsets;
        }

        private void subsetsWithDupHelper(List<List<Integer>> subsets, List<Integer> currentSubset, int[] nums, int index) {
            // Add the subset formed so far to the subsets list.
            subsets.add(new ArrayList<>(currentSubset));

            for (int i = index; i < nums.length; i++) {
                // If the current element is a duplicate, ignore.
                if (i != index && nums[i] == nums[i - 1]) {
                    continue;
                }
                currentSubset.add(nums[i]);
                subsetsWithDupHelper(subsets, currentSubset, nums, i + 1);
                currentSubset.remove(currentSubset.size() - 1);
            }
        }
    }
//js
/*
// Calculate the sum of all of the results from multiplyOneDigit.
let sumResults = function(results) {
    // Initialize answer as a number from results.
    let answer = [...results[results.length - 1]];
    let newAnswer = [];

    // Sum each digit from answer and result
    for (let j = 0; j < results.length - 1; ++j) {
        let result = [...results[j]];
        newAnswer = [];

        let carry = 0;

        for (let i = 0; i < answer.length || i < result.length; ++i) {
            // If answer is shorter than result or vice versa, use 0 as the current digit.
            let digit1 = i < result.length ? result[i] : 0;
            let digit2 = i < answer.length ? answer[i] : 0;
            // Add current digits of both numbers.
            let sum = digit1 + digit2 + carry;
            // Set carry equal to the tens place digit of sum.
            carry = Math.floor(sum / 10);
            // Append the ones place digit of sum to answer.
            newAnswer.push(sum % 10);
        }

        if (carry != 0) {
            newAnswer.push(carry);
        }
        answer = newAnswer;
    }

    // Convert answer to a string.
    let finalAnswer = [];
    for (let i = 0; i < answer.length; ++i) {
        finalAnswer.push(answer[i]);
    }
    return finalAnswer;
};

// Multiply the current digit of secondNumber with firstNumber.
let multiplyOneDigit = function(firstNumber, secondNumberDigit, numZeros) {
    // Insert zeros at the beginning based on the current digit's place.
    let currentResult = [];
    for (let i = 0; i < numZeros; ++i) {
        currentResult.push(0);
    }

    let carry = 0;

    // Multiply firstNumber with the current digit of secondNumber.
    for (let i = 0; i < firstNumber.length; ++i) {
        let firstNumberDigit = firstNumber[i];
        let multiplication = (Number(secondNumberDigit) * Number(firstNumber[i])) + carry;
        // Set carry equal to the tens place digit of multiplication.
        carry = Math.floor(multiplication / 10);
        // Append last digit to the current result.
        currentResult.push(multiplication % 10);
    }

    if (carry) {
        currentResult.push(carry);
    }
    return currentResult;
};

let multiply = function(num1, num2) {
    if (num1 === "0" || num2 === "0") {
        return "0";
    }

    let firstNumber = [...num1];
    let secondNumber = [...num2];

    // Reverse both the numbers.
    firstNumber.reverse();
    secondNumber.reverse();

    // For each digit in secondNumber, multipy the digit by firstNumber and
    // store the multiplication result (reversed) in results.
    let results = [];
    for (let i = 0; i < secondNumber.length; ++i) {
        results.push(multiplyOneDigit(firstNumber, secondNumber[i], i));
    }

    // Add all the results in the results array, and store the sum in the answer string.
    let answer = sumResults(results);

    // answer is reversed, so reverse it to get the final answer.
    answer.reverse();
    return answer.join('');
    };

*/