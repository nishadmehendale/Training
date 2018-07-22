
public class Date {
	private int d, m, y;

	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Date " + this.d + " / " + this.m + " / " + this.y + "";
	}

	public boolean isSmaller(Date d) {
		boolean flag;
		if (this.y == d.y) {
			if (this.m == d.m) {
				if (this.d == d.d) {
					flag = true;
				} else if (this.d < d.d) {
					flag = false;
				} else {
					flag = true;
				}
			} else if (this.m < d.m) {
				flag = false;
			} else {
				flag = true;
			}
		} else if (this.y < d.y) {
			flag = false;
		} else {
			flag = true;
		}
		return flag;
	}
	public int countLeapYears(Date d)
	{
	int years = d.y;

	// Check if the current year needs to be considered
	// for the count of leap years or not
	if (d.m <= 2)
	years--;

	// An year is a leap year if it is a multiple of 4,
	// multiple of 400 and not a multiple of 100.
	return years / 4 - years / 100 + years / 400;
	}
	public int diff(Date d) {
		int monthDays[] = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31}; 

    int n1 = this.y*365 + this.d;
 
    for (int i=0; i<this.m - 1; i++)
        n1 += monthDays[i];
 
    n1 += countLeapYears(this);
 
    int n2 = d.y*365 + d.d;
    for (int i=0; i<d.m - 1; i++)
        n2 += monthDays[i];
    n2 += countLeapYears(d);
 
    return (n2 - n1);

//This function counts number of leap years before the
//given date
/*
		int []difference = new int[3];
		if(isSmaller(d)) {
			
			difference[2] = this.y -d.y;
			difference[1] = this.m -d.m;
			difference[0] = this.d - d.d;
			
		}
		else {
			difference[2] = d.y - this.y;
			difference[1] = d.m - this.m;
			difference[0] = d.d - this.d;
		}
		return difference;*/
		/*int []date= new int[3];
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
		return date;*/
		//
		/*int countLeap = 0;
		int dateDifference[]=new int[3];
		int i = 0;
		// checking for number of days in a year
		if (d.m == 1 || d.m ==3 || d.m ==5 || d.m ==7 || d.m ==8 || d.m ==10 || d.m ==12)
			i = 31;
		else if (d.m == 2)
			i = 28;
		else
			i = 30;
		
		//checking for number of leap years in the duration
		 if (d.y < this.y) {
			for (int j = d.y; i < this.y; i++) {
                int result = i % 4;
                if (result == 0) {
                countLeap++;
                }
			}
		}
		
		//calculating age difference
		if(this.m < d.m){
			dateDifference[2]=(this.y - 1) - d.y;}
		else {
			dateDifference[2]=this.y - d.y;
		}
		
		if (this.m < d.m && this.d > d.d){
			dateDifference[1]= this.m + (12 - d.m); 
			dateDifference[0] = this.d - d.d + countLeap; 
		}
		else{
			dateDifference[1]= this.m + (12 - d.m -1 ); 
			dateDifference[0] = this.d + (i - d.d) + countLeap; 
		}
		
		return dateDifference;
	*/
		
	}
	public int[] difference(Date d) {
		int diff = diff(d);
		int []gap = new int[3];
		int a = countLeapYears(d);
		for(int i=0;i<4;i++)
			gap[i]=0;
		while(diff>365) {
			
			if(a>0)
				diff-=366;
			else
				diff-=365;
			gap[2] += 1;
			a-=1;
		}
		
		return gap;
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
