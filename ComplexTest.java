<<<<<<< HEAD
public class ComplexTest {

	public static void main(String[] args) {
		Complex Complex1 = new Complex();
		Complex Complex2 = new Complex();
		Complex Complex3 = new Complex();
		
		Complex1.setReal(4.5f);
		Complex1.setImaginary(5.5f);
		System.out.println(Complex1);
		
		Complex2.setReal(3.5f);
		Complex2.setImaginary(6.5f);
		System.out.println(Complex2);
		
		Complex3= Complex1.addComplex(Complex1, Complex2);
		System.out.println(Complex3);
		
	}

}
=======
//Tests complex Class and adds two complex numbers
public class ComplexTest {

	public static void main(String[] args) {
		Complex Complex1 = new Complex();
		Complex Complex2 = new Complex();
		Complex Complex3 = new Complex();
		
		Complex1.setReal(4.5f);
		Complex1.setImaginary(5.5f);
		System.out.println(Complex1);
		
		Complex2.setReal(3.5f);
		Complex2.setImaginary(6.5f);
		System.out.println(Complex2);
		
		Complex3= Complex1.addComplex(Complex1, Complex2);
		System.out.println(Complex3);
		
	}

}
>>>>>>> bd570d072b72182debd338d1f7406cb28fae8e8e
