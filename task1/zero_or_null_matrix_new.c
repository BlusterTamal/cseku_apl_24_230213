#include <stdio.h>

int main() 
{
    int rows, cols;
    scanf("%d %d", &rows, &cols); // Input the number of rows and columns
    int matrix[rows][cols]; // Declare a 2D array to store the matrix elements
    int totalelements = rows * cols; // Calculate the total number of elements in the matrix

    // Input the matrix elements
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            scanf("%d", &matrix[i][j]);
        }
    }

    int zerocount = 0; // Initialize a counter for zero elements
    // Count the number of zero elements in the matrix
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            if (matrix[i][j] == 0) 
            {
                zerocount++;
            }
        }
    }

    // Check if all elements are zero
    if (totalelements == zerocount) 
    {
        printf("zero matrix\n");
    } 
    else 
    {
        printf("Not zero matrix\n");
    }

    return 0;
}
