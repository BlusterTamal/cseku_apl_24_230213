#include <stdio.h>

int main() 
{
    int rows, cols;
    scanf("%d %d", &rows, &cols); // Input the number of rows and columns
    int matrix[rows][cols]; // Declare a 2D array to store the matrix elements

    // Input the matrix elements
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            scanf("%d", &matrix[i][j]);
        }
    }

    int isunitmatrix = 1; // Flag to check if the matrix is a unit matrix
    if (rows != cols) // Check if the matrix is not square
    {
        isunitmatrix = 0;
    }

    // Check the matrix elements
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            if (i == j) // Check diagonal elements
            { 
                if (matrix[i][j] != 1) 
                {
                    isunitmatrix = 0;
                }
            } 
            else if (matrix[i][j] != 0) // Check non-diagonal elements
            {
                isunitmatrix = 0;
            }
        }
    }

    // Print if 1 then it is unit matrix otherwise not unit matrix
    if (isunitmatrix == 1) 
    {
        printf("unit matrix\n");
    } 
    else 
    {
        printf("not unit matrix\n");
    }

    return 0;
}
