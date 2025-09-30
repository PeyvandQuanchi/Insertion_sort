# Insertion Sort Visualizer

This application was developed as the final project for the Data Structures course. It provides an interactive and visual way to understand the **Insertion Sort** algorithm, one of the fundamental sorting algorithms in computer science.

## What is Insertion Sort?

Insertion Sort is a simple sorting algorithm that builds the sorted array one element at a time. It works similarly to how you might sort playing cards in your hands:

1. Start with the second element of the array (since the first element is already considered sorted).
2. Compare it to the elements before it.
3. Shift the elements that are greater than the current element one position to the right.
4. Insert the current element in the correct position.
5. Repeat the process for the next element in the array.

While insertion sort is not the most efficient for large datasets, its simplicity makes it a useful tool for understanding sorting algorithms.

## Features

- **Interactive Visualization**: This tool allows you to visualize how **Insertion Sort** works step by step on an array of numbers.
- **Input Array**: You can input your own set of numbers into the array.
- **Step-by-Step Sorting**: The application displays how the array is sorted one element at a time, showing each step of the algorithm’s operation.
- **User-Friendly Interface**: Easily enter your numbers and see the sorting process in real-time.

## How to Use

1. **Enter Numbers**: Begin by entering the numbers for your array. You can input a series of integers, separated by commas (e.g., `5, 3, 8, 4, 2`).
2. **Start Sorting**: After entering the numbers, click the "Sort" button. The application will show you how the Insertion Sort algorithm sorts the array step by step.
3. **Watch the Process**: You will see how each element is compared and shifted, with the array progressively becoming more sorted after each step.

## Visual Representation

A graphical representation of the sorting process will be displayed below the input section. This shows how the algorithm works at each step, so you can visually track the changes in the array as it gets sorted.

## Application Workflow

- **Input Field**: A text box allows users to input their numbers for the array.
- **Sort Button**: When clicked, the Insertion Sort algorithm begins, and the application will process the numbers one by one.
- **Step-by-Step Display**: For each step of the algorithm, the current state of the array is displayed along with an explanation of the operation being performed (e.g., which element is being inserted into the sorted portion of the array).
- **Visualization of Array Movement**: The positions of the array elements are shown graphically, allowing users to visually grasp how the elements move during the sorting process.

## Example

For example, if you input the array `5, 3, 8, 4, 2`, the application will:

1. Start by looking at the second element (3) and comparing it with 5. Since 3 is smaller, it is inserted before 5.
2. Then, it moves to 8, which is already in the correct position, so it stays where it is.
3. It proceeds with 4, which gets inserted between 3 and 5.
4. Finally, it handles 2, which is placed in the first position, completing the sorting process.

By watching these steps visually, you’ll get a clearer idea of how the insertion sort algorithm works.

## Screenshot

Below is a screenshot of the application in action:

![IMG_20241112_180125](https://github.com/user-attachments/assets/0733e777-38d6-4af6-9b37-65fece661646)

## Conclusion

This application offers a hands-on, visual introduction to the **Insertion Sort** algorithm, ideal for students or anyone wanting to better understand this foundational sorting technique. By inputting your own numbers and watching the algorithm sort them step by step, you can gain a deeper understanding of how insertion sort functions and how elements are rearranged in the array.

## Technical Details

This application was developed using Python and relies on simple algorithms to animate the sorting process. It was designed to be a lightweight educational tool to demonstrate how sorting algorithms can be implemented and visualized in a way that is easy to understand.

---

Feel free to explore the source code, modify the application, or contribute with new features or improvements!



