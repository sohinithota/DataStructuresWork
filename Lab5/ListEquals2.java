public class ListEquals2<E> extends ExtArrayList<E>
{
/*
 * put one array on the outside, and put the this. array on the inside
 * inside 2nd array, use "contains"
 * 
 */
	public boolean equals(ExtArrayList<E> eal)
	{
		if(this.size() != eal.size())
		{
			return false;
		}
		
		else
		{
			for(E list0:eal)
			{
				if(!this.contains(list0))
					return false;
			}
			return true;
		}
	}
}