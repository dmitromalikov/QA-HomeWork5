package HomeWork5.lesson5.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

public class Employee2TestNG {

	@BeforeClass
	public static void StartMessage() {
		System.out.println("Employee2TestNG testing started . . .");
		}

	@AfterClass
	public static void FinishMessage() {
		System.out.println("Employee2TestNG testing completed.");
		}

	@BeforeMethod
	public void StartTestMessage() {
		System.out.println("The next test is started . . .");
		}

	@AfterMethod
	public void FinishTestMessage() {
		System.out.println("The test is completed.");
		}
	
	Employee2 Employee2 = new Employee2();
	
	@Test (enabled = false)
	public void testOther () { 
	}
	
	@Test (timeOut=3000, groups={"unit1"}, dependsOnMethods={"testFactCompensationFuelAuto"})
 			public void testDaysWorkedInMonth () { //���������� ������������ ���� � ������
			int expected = 21;	
			int actual = Employee2.daysWorkedInMonth(22, 1);
			assertEquals(expected, actual); 
		}
		     
		 	@Test (groups={"unit2"})
			public void testFactCompensationFuelAuto () { //����������� ������� ����
				double expected = 18496.153;
				double actual = Employee2.factCompensationFuelAuto(8567, 25.40, 8.5);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit2"}, dependsOnMethods={"testDaysWorkedInMonth"})
			public void testFactCarMileagePerMonth () { //����������� ������ ���� �� �����
				int expected = 8547;
				int actual = Employee2.factCarMileagePerMonth(407, 21);
				assertEquals(expected, actual); 
			}

			@Test (groups={"unit1"})
			public void testFactBonus () { //����� �� ���������� ������
				double expected = 372.9009228;
				double actual = Employee2.factBonus(11353.7, 1.15, 1.19, 1.2);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit3"})
			public void testFactRate () { //���� ������
				double expected = 10837.62272727273;
				double actual = Employee2.factRate(11353.7, 21, 22);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit4"})
			public void testSingleTax () { //������ ����� �������� ���������������
				double expected = 1639.4875;
				double actual = Employee2.singleTax(32789.75, 5);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit5"})
			public void testSocialContribution () { //���������� ����� �������� ����������������

				double expected = 721.435;
				double actual = Employee2.socialContribution(3279.25, 22);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit3"})
			public void testCompensationOfTaxes () { //����������� �������

				double expected = 2360.9225;
				double actual = Employee2.compensationOfTaxes(721.435, 1639.4875);
				assertEquals(expected, actual, 0.001);
			}

			@Test (groups={"unit1"})
			public void testFactSalary () { //��������
				double expected = 36557.2;
				double actual = Employee2.factSalary(11353.7, 14689.7, 8356.5, 2157.3);
				assertEquals(expected, actual, 0.001); 
			}

			@Test (groups={"unit5"})
			public void testGrade () { //����� ����������
		 		double expected = 4.3;
				double actual = Employee2.grade(4.0, 6.4, 2.5);
				assertEquals(expected, actual, 0.001); 
			}

			@Test (groups={"unit3"})
			public void testFactCompensationAuto () { //����������� ������������� ���������� � ������� �����
				double expected = 7924.5;
				double actual = Employee2.factCompensationAuto(2357.3, 5567.2);
				assertEquals(expected, actual, 0.001); 
			}

			@Test (groups={"unit4"})
			public void testFactCompensationAmmortizationAuto () { //����������� ������������ ����������
				double expected = 6425.25;
				double actual = Employee2.factCompensationAmmortizationAuto(8567, 0.75);
				assertEquals(expected, actual, 0.001); 
			}
	
}
