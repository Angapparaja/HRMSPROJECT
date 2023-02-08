package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterAttendanceShift extends TestBase {

	@FindBy(xpath = "//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;

	//ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;

	//Shift
	@FindBy(xpath = "//*[text()='Shift' and @class='menu_current']")
	WebElement shift;

	// ADD shift
	@FindBy(xpath = "//*[@id='swap']")
	WebElement addShift;

	//shiftCode 
	@FindBy(xpath = "//*[@id='shiftCode']")
	WebElement shiftCode;

	//shiftDescription 
	@FindBy(xpath = "//*[@id='shiftCat']")
	WebElement shiftDes;
	
	//shiftFrom 
	@FindBy(xpath = "//*[@id='shiftFrom']")
	WebElement shiftFrom;
	
	//shiftFromChooseTime
	@FindBy(xpath = "//a[text()='08']")
	WebElement selectstartTime;
	
	//shiftTo 
	@FindBy(xpath ="//input[@id='shiftTo']")
	WebElement shiftTo;
	
	//selectEndTime
	@FindBy(xpath="//a[text()='14']")
    WebElement selectendTime;
	
	//BufferInHour
	@FindBy(xpath="//input[@id='bufferinHour']")
	WebElement BufferInInput;
	
	//BufferInHourTime
	@FindBy(xpath="//a[text()='07']")
	WebElement BufferInHourTime;
	
	//BufferInhour
	@FindBy(xpath="//input[@id='bufferinTime']")
	WebElement BufferInHourMint;
	
	//BufferOutHour
	@FindBy(xpath="//input[@id='bufferoutHour']")
	WebElement BufferOutInput;
	
	//BufferOutHourTime
	@FindBy(xpath="//a[text()='19']")
	WebElement BufferOutHourTime;
	
	//Break 1 time outTime
	@FindBy(xpath="//input[@id='firstbreak_starttime']")
	WebElement Break1TimeOut;
	
	//Break 1 time hourOut
	@FindBy(xpath="//a[text()='02']")
	WebElement Break1TimeHourOut;
	
	//Break 1 time hourIn
	@FindBy(xpath="//input[@id='firstbreak_starttime']")
	WebElement Break1TimeFromInput;
	//Break To Time end Input
	@FindBy(xpath="//input[@id='firstbreak_endtime']")
	WebElement Break1TimeEndInput;
	//Break 1 time hourIn
		@FindBy(xpath="//a[text()='02']")
		WebElement Break1TimeHourIn;
		
	// save button
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveButton;

	// reset button
	@FindBy(xpath = "//*[text()='Reset']")
	WebElement resetButton;

	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;

	// next button
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	// SkillName Mandatory
	@FindBy(xpath = "//*[text()='Please Enter skill Name']")
	WebElement titleMandatory;
	
	//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;

	
	public MasterAttendanceShift() {
		PageFactory.initElements(driver, this);
	}

	public String addWorkLocatin() {
		return new String();
	}

	public boolean addAttendanceShift(String code,String Description,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		addShift.click();
		Thread.sleep(500);
	
		shiftCode.sendKeys(code);
		
		shiftDes.sendKeys(Description);
		Thread.sleep(500);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(500);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(500);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
		 Thread.sleep(500);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
			 Thread.sleep(500);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(500);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(500);;
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(500);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
		Thread.sleep(1000);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(500);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(500);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(500);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(1000);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(500);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(500);
		saveButton.click();
		
		return true;

	}
	
	public String AttendanceShiftCodeNegativeCheck(String code,String Description,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(1000);
		addShift.click();
		Thread.sleep(1000);
	
		shiftCode.sendKeys(code);
		Thread.sleep(1000);
		shiftDes.sendKeys(Description);
		Thread.sleep(1000);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(1000);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(1000);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
			Thread.sleep(1000);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
				Thread.sleep(1000);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(1000);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(1000);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(1000);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
		Thread.sleep(1000);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(1000);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(1000);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(1000);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(1000);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(1000);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String Attendanceshift=duplicateCheck.getText(); 
		return Attendanceshift;



	}
	
	public String AttendanceShiftCodeMandatoryFieldCheck(String Description,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		addShift.click();
		Thread.sleep(500);
	
//		shiftCode.sendKeys(code);
		Thread.sleep(500);
		shiftDes.sendKeys(Description);
		Thread.sleep(500);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(500);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(500);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
		 Thread.sleep(500);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
			 Thread.sleep(500);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(500);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(500);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(500);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
			 Thread.sleep(500);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(500);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(500);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(500);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(500);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(500);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String Attendanceshift=duplicateCheck.getText(); 
		return Attendanceshift;



	}
	
	
	public String AttendanceShiftDescriptionMandatoryFieldCheck(String code,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		addShift.click();
		Thread.sleep(500);
	
		shiftCode.sendKeys(code);
		Thread.sleep(500);
//		shiftDes.sendKeys(Description);
		Thread.sleep(500);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(500);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(500);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
		 Thread.sleep(500);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
			 Thread.sleep(500);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(500);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(500);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(500);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
			 Thread.sleep(500);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(1000);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(500);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(500);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(500);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(500);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String Attendanceshift=duplicateCheck.getText(); 
		return Attendanceshift;



	}
	
	
	
	public String AttendanceShiftFromTimeMandatoryFieldCheck(String code,String Description,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		addShift.click();
		Thread.sleep(500);
	
		shiftCode.sendKeys(code);
		Thread.sleep(500);
		shiftDes.sendKeys(Description);
		Thread.sleep(500);
//		shiftFrom.click();
//		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
//		shiftFromHour.click();
//		Thread.sleep(1000);
//		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
//		shiftFromMin.click();
//		Thread.sleep(1000);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
		 Thread.sleep(500);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
			 Thread.sleep(500);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(500);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(500);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(500);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
			 Thread.sleep(500);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(500);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(500);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(500);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(500);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(500);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String Attendanceshift=duplicateCheck.getText(); 
		return Attendanceshift;



	}
	
	
	
	
	
	
	
	
	

	public String addAttendanceShiftCodeDuplicateCheck(String code,String Description,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(1000);
		addShift.click();
		Thread.sleep(1000);
	
		shiftCode.sendKeys(code);
		Thread.sleep(1000);
		shiftDes.sendKeys(Description);
		Thread.sleep(1000);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(1000);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(1000);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
			Thread.sleep(1000);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
				Thread.sleep(1000);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(1000);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(1000);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(1000);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
		Thread.sleep(1000);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(1000);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(1000);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(1000);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(1000);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(1000);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String Attendanceshift=duplicateCheck.getText(); 
		return Attendanceshift;



	}
	
	
	
	
	
	public boolean verifyAttendanceShiftResetButton(String code,String Description,String FromHour,String FromMintue,String ToTimeHour,String ToTimeMin,String BufferInHour,String BufferInMin,String BufferOutHour,String BufferOutMin,
			String Break1TimeFromHour,String Break1TimeFromMin,String Break1TimeToHour,String Break1TimeToMin) throws InterruptedException {
		Thread.sleep(1000);
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		addShift.click();
		Thread.sleep(500);
	
		shiftCode.sendKeys(code);
		Thread.sleep(500);
		shiftDes.sendKeys(Description);
		Thread.sleep(500);
		shiftFrom.click();
		 WebElement shiftFromHour= driver.findElement(By.xpath("//a[text()='"+FromHour+"']"));
		shiftFromHour.click();
		Thread.sleep(500);
		 WebElement shiftFromMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+FromMintue+"'])"));
		shiftFromMin.click();
		Thread.sleep(500);
		shiftTo.click();
		//selectstartTime.click();
//		shiftTo.click();
		 WebElement shiftToHour= driver.findElement(By.xpath("//a[text()='"+ToTimeHour+"']"));
		 shiftToHour.click();
		 Thread.sleep(500);
			 WebElement shiftToMin = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+ToTimeMin+"'])"));
			 shiftToMin.click();
			 Thread.sleep(500);
		//selectendTime.click();
	
		BufferInInput.click();
		Thread.sleep(500);
		 WebElement BufferInHours= driver.findElement(By.xpath("//a[text()='"+BufferInHour+"']"));
		 BufferInHours.click();
		 Thread.sleep(500);
			 WebElement BufferInMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferInMin+"'])"));
			 BufferInMins.click();
			 Thread.sleep(500);
//		BufferInHourTime.click();
//		BufferInHourMint.click();
			 Thread.sleep(500);
		BufferOutInput.click();
		 WebElement BufferOutHours= driver.findElement(By.xpath("//a[text()='"+BufferOutHour+"']"));
		 BufferOutHours.click();
		 Thread.sleep(500);
			 WebElement BufferOutMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+BufferOutMin+"'])"));
			 BufferOutMins.click();
			 Thread.sleep(500);
//		Break1TimeOut.click();
//		Break1TimeHourOut.click();
		
		Break1TimeFromInput.click();
		WebElement Break1TimeFromHours= driver.findElement(By.xpath("//a[text()='"+Break1TimeFromHour+"']"));
		Break1TimeFromHours.click();
		Thread.sleep(500);
			 WebElement Break1TimeFromMins = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeFromMin+"'])"));
			 Break1TimeFromMins.click();
			 Thread.sleep(500);
		//Break1TimeHourIn.click();
			 Break1TimeEndInput.click();
			 WebElement Break1TimeToHourss= driver.findElement(By.xpath("//a[text()='"+Break1TimeToHour+"']"));
			 Break1TimeToHourss.click();
			 Thread.sleep(500);
					 WebElement Break1TimeToMinss = driver.findElement(By.xpath("(//td[@class='ui-timepicker-minutes']//a[text()='"+Break1TimeToMin+"'])"));
					 Break1TimeToMinss.click();
					 Thread.sleep(500);
	
		resetButton.click();
		
		return true;

	}
	
//	
//	public boolean skillNameMandatoryFieldCheck() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(2000);
//		recruitment.click();
//		Thread.sleep(2000);
//		skill.click();
//		Thread.sleep(2000);
//		addSkill.click();
//		Thread.sleep(2000);
//		skillName.sendKeys("Artificial Intelligence");
//		Thread.sleep(2000);
//		saveButton.click();
//		Thread.sleep(3000);
//		return false;
//
//	}
//

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(1000);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("next button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("next button not visible");
        } 
        return flag;
		
	}

	public Boolean searchAttendanceShiftpagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		attendance.click();
		Thread.sleep(1000);
		shift.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
	
	
}
