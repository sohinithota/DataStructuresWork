import java.util.*;

public class NonRecursiveMaze {
	int N=4;
	static int [][] maze ={{1,0,0,0},
			{1,1,0,1},
			{0,1,0,0},
			{1,1,1,1}};
	boolean [][] visited = new boolean[N][N];
	static class Cell
	{
		int x,y;
		Cell(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	Stack<Cell> cellStack = new Stack();
	 
	public NonRecursiveMaze(int [][]other)
	{
		N = other.length;
		maze = new int[N][N];
		visited = new boolean[N][N];
		for(int i = 0;i<maze.length;i++)
		{
			for(int j=0;j<maze[i].length;j++)
			{
				maze[i][j] = other[i][j];
				visited[i][j]= false;
			}
		}
	}

	public boolean isSafe(int x, int y)
	{
			return (x>=0 && x<N && y>=0  && y<N && (maze[x][y] == 1) && (!visited[x][y]));
			
	}

	public void printSolution()
	{
		if(visited[N-1][N-1] == false)
			System.out.println("no solution");
		else
		{
			for(int i = 0; i<visited.length;i++)
			{
				for(int j=0;j<visited[i].length;j++)
					if (visited[i][j] == true)
						System.out.println("("+i+","+j+")");
			}
		}
	}
	


	//NonRecursive solveMaze
	public boolean solveMaze(int x, int y)
	{
		cellStack.push(new Cell(0,0));
		visited[0][0] = true;
		Cell end = new Cell(N-1,N-1);
		
		while(!cellStack.isEmpty())
		{
			Cell lastCell = cellStack.pop();
			x = lastCell.x;
			y = lastCell.y;
		if((x == N-1) && (y==N-1))
		{
			printSolution();
			return true;
		}
			if(isSafe(x,y+1))
			{
				cellStack.push(new Cell(x,y+1));
				visited[x][y+1] = true;
			}
			if(isSafe(x,y-1))
			{
				cellStack.push(new Cell(x,y-1));
				visited[x][y-1] = true;
			}
			if(isSafe(x+1,y))
			{
				cellStack.push(new Cell(x+1,y));
				visited[x+1][y] = true;
			}
			if(isSafe(x-1,y))
			{
				cellStack.push(new Cell(x-1,y));
				visited[x-1][y] = true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		RecursiveMaze rat = new RecursiveMaze();
			rat.solveMaze(0,0);
			rat.printSolution();
		}
	}