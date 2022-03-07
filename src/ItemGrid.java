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
    /* to be implemented in part (a) */
  }

  /** Returns the average value of all the items in grid,
   *  as described in part (b).
   */
  public double findAverage()
  {
    /* to be implemented in part (b) */
  }
}