public class ItemGrid
{
  private Item[][] grid;

  /** Constructor */
  public ItemGrid(Item[][] grid)
  {
    this.grid = grid;
  }
  
 /** Returns true if row is a valid row index and column is a valid
  *  column index and returns false otherwise.
  *  THIS CODE WAS NOT PROVIDED IN FRQ, but here is what you would have seen if it had been
  */
  public boolean isValid(int row, int column)
  {
    if (row < 0 || row >= grid.length)
    {
      return false;
    }
    if (column < 0 || column >= grid[0].length)
    {
      return false;
    }
    
    return true;
  }

 /** Compares the item in row r and column c to the items to its
  *  left and to its right. Returns the name of the item with
  *  the greatest value, as described in part (a).
  *
  *  Precondition: r and c are valid indices
  */
  public String mostValuableNeighbor(int r, int c)
  {
    String mostValuable = grid[r][c].getName();
    int max = grid[r][c].getValue();
    if (isValid(r, c - 1))
    {
        if (grid[r][c - 1].getValue() > max)
        {
            mostValuable = grid[r][c - 1].getName();
            max = grid[r][c - 1].getValue();
        }
    }
      if (isValid(r, c + 1))
      {
          if (grid[r][c + 1].getValue() > max)
          {
              mostValuable = grid[r][c + 1].getName();
              max = grid[r][c + 1].getValue();
          }
      }
      return mostValuable;
  }

  /** Returns the average value of all the items in grid,
   *  as described in part (b).
   */
  public double findAverage()
  {
    double total = 0;
    int count = 0;
    for (int rows = 0; rows < grid.length; rows++)
    {
        for (int cols = 0; cols < grid[0].length; cols++)
        {
            total += grid[rows][cols].getValue();
            count++;
        }
    }
    return (total / count);
  }
}