<<<<<<< HEAD
import java.time.*;
public class Date {
	private int d,m,y;
	public Date(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Date " + this.d + " / " + this.m +  " / " + this.y + "";
	}
	
	public boolean isSmaller(Date d) {
		boolean flag;
		if(this.y == d.y)
		{
			if(this.m == d.m)
			{
				if(this.d == d.d)
				{
					flag = true;
				}
				else if(this.d < d.d)
				{
					flag = false;
				}
				else
				{
					flag = true;
				}
			}
			else if(this.m < d.m)
			{
				flag = false;
			}
			else{
				flag = true;
			}
		}
		else if (this.y < d.y)
		{
			flag = false;
		}
		else
		{
			flag = true;
		}
		return flag;
		}
	public int[] diff(Date d) {
		int []date= new int[3];
		if(this.y >= d.y)
		{
			date[2] = this.y - d.y;
		}
		else
		{
			date[2] = d.y - this.y;
		}
		if(this.m >= d.m)
		{
			date[1] = this.m - d.m;
		}
		else
		{
			date[1] = d.m - this.m;
		}
		if(this.d >= d.d)
		{
			date[0] = this.d - d.d;
		}
		else
		{
			date[0] = d.d - this.d;
		}
		return date;
	}
	public int getD() {
		return d;
	}
	public int getM() {
		return m;
	}
	public int getY() {
		return y;
	}
	
}
=======
import java.time.*;
public class Date {
	private int d,m,y;
	public Date(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Date " + this.d + " / " + this.m +  " / " + this.y + "";
	}
	
	public boolean isSmaller(Date d) {
		boolean flag;
		if(this.y == d.y)
		{
			if(this.m == d.m)
			{
				if(this.d == d.d)
				{
					flag = true;
				}
				else if(this.d < d.d)
				{
					flag = false;
				}
				else
				{
					flag = true;
				}
			}
			else if(this.m < d.m)
			{
				flag = false;
			}
			else{
				flag = true;
			}
		}
		else if (this.y < d.y)
		{
			flag = false;
		}
		else
		{
			flag = true;
		}
		return flag;
		}
	
	public int[] diff(Date d) {
		int []date= new int[3];
		if(this.y >= d.y)
		{
			date[2] = this.y - d.y;
		}
		else
		{
			date[2] = d.y - this.y;
		}
		if(this.m >= d.m)
		{
			date[1] = this.m - d.m;
		}
		else
		{
			date[1] = d.m - this.m;
		}
		if(this.d >= d.d)
		{
			date[0] = this.d - d.d;
		}
		else
		{
			date[0] = d.d - this.d;
		}
		return date;
	}
	public int getD() {
		return d;
	}
	public int getM() {
		return m;
	}
	public int getY() {
		return y;
	}
	
}
>>>>>>> bd570d072b72182debd338d1f7406cb28fae8e8e
