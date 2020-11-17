
import java.util.*;
public class RecursiveMaze {
	int N=4;
	static int [][] maze ={{1,0,0,0},
			{1,1,0,1},
			{0,1,0,0},
			{1,1,1,1}};
	//= new int [x][y];
	boolean [][] visited = new boolean[N][N];
	/*
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
*/
	
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

	public boolean solveMaze(int x, int y)
	{
		//visited[0][0] = true;
		if((x==N-1) && (y ==N-1))
			{
			visited[N-1][N-1] = true;
			return true;
			}
		else
		{
			if(isSafe(x,y))
			{
				visited[x][y] = true;
			if(solveMaze(x,y+1))
				return true;
				//visited[x][y+1] = true;
			if(solveMaze(x+1,y))
				return true;
			if(solveMaze(x-1,y))
				return true;
				//visited[x+1][y] = true;
			if(solveMaze(x,y-1))
				return true;
				//visited[x][y-1] = true;
			
		}
	}
		return false;
	}
	//recursive method
	public static void main(String[] args)
		{
			 //maze to test
			RecursiveMaze rat = new RecursiveMaze();
			rat.solveMaze(0,0);
			rat.printSolution();
		}
	}
