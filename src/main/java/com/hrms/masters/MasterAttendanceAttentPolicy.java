package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceAttentPolicy extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
			//AttendancePolicy
			@FindBy(xpath = "//span[@id='attendancePolicy']")
			WebElement attendancePolicylink;
			
			//AttendanceADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement AddAttentPolicy;
			
			//AttendancePolicyName
			@FindBy(xpath = "//input[@id='policyNameG']")
			WebElement attendancePolicyInput;
			
			//Policy Description
			@FindBy(xpath="//input[@id='descriptionG']")
			WebElement PolicyDescription;
			
			//click TradinessMenu
			@FindBy(xpath="//a[text()='Tardiness']")
			WebElement TradinessMenu;
			
			//FlexIn
			@FindBy(xpath="(//span[@class='checkmark'])[3]")
			WebElement FlexIn;
			
			//FlexIn_Min
			@FindBy(xpath="(//input[@id='flexyInTime'])")
			WebElement FlexInMin;
			
			//GraceIn 
			@FindBy(xpath="(//span[@class='checkmark'])[5]")
			WebElement GraceIn;
			
			//GraceIn Min
			@FindBy(xpath="//input[@id='lopgraceIn']")
			WebElement GraceInMin;
			
			//TradinessCompution
			@FindBy(xpath="//*[@id='tardinessCompute']")
			WebElement TradinessCompution;
			
			//AdjustmentOfTradiness
			@FindBy(xpath="(//span[@class='checkmark'])[7]")
			WebElement AdjustmentofTradiness;
			
			
			//click UnderTime menu 2 
			@FindBy(xpath="//a[text()='Undertime']")
			WebElement UnderTime;
			
			//Flexi_out
			@FindBy(xpath="(//span[@class='checkmark'])[9]")
			WebElement FlexOut;
			
			//Flexi_out_Min
			@FindBy(xpath="//input[@id='flexyOutTime']")
			WebElement FlexiOutMin;
			
			//GraceOut
			@FindBy(xpath="(//span[@class='checkmark'])[11]")
			WebElement GraceOut;
			
			//GraceOutTime
			@FindBy(xpath="//input[@id='graceOutTime']")
			WebElement GraceOutTime;
			
			//UnderTimeComputation
			@FindBy(xpath="//*[@id='undertimeCompute']")
			WebElement UnderTimeCompute;
			
			//AdjustUnderTimeWithOt
			@FindBy(xpath="(//span[@class='checkmark'])[13]")
			WebElement AdjustUnderTime;
			
			//click TradinessBreakTime 3
			@FindBy(xpath="//a[text()='Tardiness Break time']")
			WebElement TradinessBreakTime;
			
			//GraceTimeBreakApplicity
			@FindBy(xpath="(//span[@class='checkmark'])[15]")
			WebElement GraceTimeBreakApplicity;
			
			//GraceTimeBreakInMin
			@FindBy(xpath="//input[@id='graceTime']")
			WebElement GraceTimeBreakInMin;
			
			//GraceTradinessComputation
			@FindBy(xpath="//*[@id='breakTardinessCompute']")
			WebElement GraceTradinessComputation;
			
			//AdjustmentOfTradiness&EarlyBreak
			@FindBy(xpath="(//span[@class='checkmark'])[17]")
			WebElement AdjustmentOfTradinessEarlyBreak;
			
			//EarlyBreakTime menu 4
			@FindBy(xpath="//a[text()='Early Break time']")
			WebElement EarlyBreakTime;
			
			//EarlyBreakComputation
			@FindBy(xpath="(//span[@class='checkmark'])[19]")
			WebElement EarlyBreakComputation;
			
			//EarlyBreakComputationMethod
			@FindBy(xpath="//*[@id='earlyBreakComputeMethod']")
			WebElement EarlyBreakComputationMethod;
			
			//click Over time menu 4
			@FindBy(xpath="//a[text()='Over time']")
			WebElement OverTime;
			
			//otapplicableYes
			@FindBy(xpath="(//span[@class='checkmark'])[21]")
			WebElement OtapplicableYes;
			
			//otapplicableNo
			@FindBy(xpath="(//span[@class='checkmark'])[22]")
			WebElement OtapplicableNo;
			
			//ConsiderOt BeforeshiftTime
			@FindBy(xpath="(//span[@class='checkmark'])[23]")
			WebElement OtBeforeTime;
			
			
			//ConsiderOt AftershiftTime
			@FindBy(xpath="(//span[@class='checkmark'])[24]")
			WebElement OtAfterShiftTime;
			
			//ConsiderOt both Time
			@FindBy(xpath="(//span[@class='checkmark'])[25]")
			WebElement otshiftboth;
			
			//Qualification  of minimum OT
			@FindBy(xpath="(//span[@class='checkmark'])[26]")
			WebElement qualifiMinOt;
			
			//Qualification  of Beyond OT
			@FindBy(xpath="(//span[@class='checkmark'])[27]")
			WebElement qualifiBeyondOt;
			
			//minimumot
			@FindBy(xpath="//input[@id='otMinHours']")
			WebElement MinimumOt;
			
			//OVER TIME POST ADJ OF TARDINESS Ignore Ot
			@FindBy(xpath="(//span[@class='checkmark'])[28]")
			WebElement OverTimeIgnoreot;
			
			//OVER TIME POST ADJ OF TARDINESS Actual Post Adjustment
			@FindBy(xpath="(//span[@class='checkmark'])[29]")
			WebElement OverTimeAdjustment;
			
			//SETTLEMENT OF EXCESS OF HOURS PayOutOt
			@FindBy(xpath="(//span[@class='checkmark'])[34]")
			WebElement PayOutOt;
			
			//SETTLEMENT OF EXCESS OF HOURS Toil
			@FindBy(xpath="(//span[@class='checkmark'])[35]")
			WebElement Toil;
			
			//SETTLEMENT OF EXCESS OF HOURS DegradePost
			@FindBy(xpath="(//span[@class='checkmark'])[36]")
			WebElement DisregardPost;
			
			//TOIL APPLICABILITY Regular
			@FindBy(xpath="(//span[@class='checkmark'])[37]")
			WebElement ToilRegular;
			
			//TOIL APPLICABILITY RestDay
			@FindBy(xpath="(//span[@class='checkmark'])[38]")
			WebElement ToilRestDay;
			
			//TOIL APPLICABILITY Holiday
			@FindBy(xpath="(//span[@class='checkmark'])[39]")
			WebElement ToilHoliday;
			
			//TYPE OF DAY CALCULATION METHOD START DAY
			@FindBy(xpath="(//span[@class='checkmark'])[40]")
			WebElement CalStartDay;
			
			//TYPE OF DAY CALCULATION METHOD End DAY
			@FindBy(xpath="(//span[@class='checkmark'])[41]")
			WebElement CalEndDay;
			
			//NIGHT DIFFERENTIAL Yes
			@FindBy(xpath="(//span[@class='checkmark'])[42]")
			WebElement NightDiffYes;
			
			//NIGHT DIFFERENTIAL No
			@FindBy(xpath="(//span[@class='checkmark'])[43]")
			WebElement NightDiffNo;
			
			//RestDay &HoliDay Buffer In Time
			@FindBy(xpath="//input[@id='restdayBufferin']")
			WebElement HoliBuffIn;
			
			@FindBy(xpath="//div[@class='clockpicker-tick'][text()='15']")
			WebElement clock1;
			
			@FindBy(xpath="//div[@style='visibility: visible;']/div[text()=10]")
			WebElement clock2;
			
			
			
			@FindBy(xpath="(//div[@class='clockpicker-tick'][text()='15'])[3]")
			WebElement clock3;
			
			@FindBy(xpath="(//div[@style='visibility: visible;']/div[text()=10])[2]")
			WebElement clock4;
			
			
			
			//RestDay &HoliDay Buffer Out Time
			@FindBy(xpath="//input[@id='restdayBufferout']")
			WebElement HoliBuffInOut;
			
			//Click Forms day menu 5
			@FindBy(xpath="//a[text()='Form Days']")
			WebElement FormMenu;
			
			//Leaveform
			@FindBy(xpath="//input[@id='leaveDays']")
			WebElement LeaveForm;
			
			//OverTimeForm
			@FindBy(xpath="//input[@id='otDays']")
			WebElement OverTimeForm;
			
			//RestDayForm
			@FindBy(xpath="//input[@id='restDays']")
			WebElement RestDayForm;
			
			//TIMELOG FORM
			@FindBy(xpath="//input[@id='timelogDays']")
			WebElement TimeLogForm;
			
			//ODForm
			@FindBy(xpath="//input[@id='odDays']")
			WebElement Odform;
			
			//ShiftForm
			@FindBy(xpath="//input[@id='shiftDays']")
			WebElement ShiftForm;
			
			//PERMISSION FORM
			@FindBy(xpath="//input[@id='permissionDays']")
			WebElement permissform;
			
			
			//PERMISSION LINK
			@FindBy(xpath="//a[text()='Permission']")
			WebElement permissionLink;
			
			
			
			//HalfDayPresentRulesChecking
			@FindBy(xpath="(//span[@class='checkmark'])[44]")
			WebElement PresentRulesChecking;
			
			//HalfDay Present(Min)
			@FindBy(xpath="//input[@id='halfdayPresent']")
			WebElement HalfDayPresent;
			
			//FullDayPresentRulesChecking
			@FindBy(xpath="(//span[@class='checkmark'])[46]")
			WebElement FullDayPresentRulesChecking;
			
			//FullDayPresentMin
			@FindBy(xpath="//input[@id='fulldayPresent']")
			WebElement FullDayPresentMin;
			
			//IfEarlyGoingIsGreaterThan
			@FindBy(xpath="//input[@id='maximumLate']")
			WebElement EarlyGoingIsGreaterThan;
			
			//IfLateEntryIsGreaterThan
			@FindBy(xpath="//input[@id='maximumLate1']")
			WebElement LateEntryIsGreaterThan;
			
			//SecondHalfLateEntryGreaterThan
			@FindBy(xpath="//input[@id='maximumUndertime']")
			WebElement SecondHalfLateEntryGreaterThan;
			
			//SecondHalfEarlyGoingGreaterThan
			@FindBy(xpath="//input[@id='maximumUndertime1']")
			WebElement SecondHalfEarlyGoingGreaterThan;
			
			//SummaryPermissibleLateEntryInAMonth
			@FindBy(xpath="//input[@id='noofLatePermission']")
			WebElement SummaryPermissibleLateEntryInAMonth;
			
			//SummaryPermissibleEarlyGoingInAMonth
			@FindBy(xpath="//input[@id='noofUndertimePermission']")
			WebElement SummaryPermissibleEarlyGoingInAMonth;
			
			//SummaryCountedForAdjustment
			@FindBy(xpath="//input[@id='maximumlatePerMonth']")
			WebElement SummaryCountedForAdjustment;
			
			//SummaryDaysToBeAdjustedInLE
			@FindBy(xpath="//input[@id='daysAdjusted']")
			WebElement SummaryDaysToBeAdjustedInLE;
			
			
			//SummaryOccuranceBeCountedForAdjustment
			@FindBy(xpath="//input[@id='maximumUndertimePerMonth']")
			WebElement SummaryOccuranceBeCountedForAdjustment;
			
			//SummaryAdjustedInEE
			@FindBy(xpath="//input[@id='daysAdjustedUndertime']")
			WebElement SummaryAdjustedInEE;
			
			//SummaryPermissionHoursmin
			@FindBy(xpath="//input[@id='permissionHours']")
			WebElement SummaryPermissionHoursmin;
			
			//SummaryNoofPermissionAllowedMonth
			@FindBy(xpath="//input[@id='permissionAllowedMonth']")
			WebElement SummaryNoofPermissionAllowedMonth;
			
			//save button
			@FindBy(xpath = "//*[text()='Save']")
			WebElement saveButton;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
			
			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
			
			public MasterAttendanceAttentPolicy() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addPolicy(String policy,String poliDescription) throws InterruptedException {
				
				try {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(1000);
				AddAttentPolicy.click();
				Thread.sleep(1000);
				attendancePolicyInput.sendKeys(policy);
				Thread.sleep(1000);
				PolicyDescription.sendKeys(poliDescription);
				Thread.sleep(1000);
				TradinessMenu.click();
				Thread.sleep(1000);
                boolean selectType = FlexIn.isSelected();
				//performing click operation only if element is not selected
				if(selectType == false) {
					FlexIn.click();
				}
				Thread.sleep(1000);
				FlexInMin.sendKeys("20");
				Thread.sleep(1000);
				 boolean selectType1 = GraceIn.isSelected();
					//performing click operation only if element is not selected
					if(selectType1 == false) {
						GraceIn.click();
					}
					Thread.sleep(1000);
					GraceInMin.sendKeys("30");
					Thread.sleep(1000);
					Select Selectmonth=new Select(TradinessCompution);
					Selectmonth.selectByVisibleText("Ignore Tardiness");
					Thread.sleep(1000);
					 boolean selectType2 = GraceIn.isSelected();
						//performing click operation only if element is not selected
						if(selectType2 == false) {
							AdjustmentofTradiness.click();
						}
						Thread.sleep(1000);
						UnderTime.click();
						Thread.sleep(1000);
						FlexOut.click();
						Thread.sleep(1000);
						FlexiOutMin.sendKeys("30");
						Thread.sleep(1000);
						GraceOut.click();
						Thread.sleep(1000);
						GraceOutTime.sendKeys("40");
						Thread.sleep(1000);
						Select SelectGraceout=new Select(UnderTimeCompute);
						SelectGraceout.selectByVisibleText("Ignore Undertime");
						Thread.sleep(1000);
						AdjustUnderTime.click();
						Thread.sleep(1000);
						TradinessBreakTime.click();
						Thread.sleep(1000);
						GraceTimeBreakApplicity.click();
						Thread.sleep(1000);
						GraceTimeBreakInMin.sendKeys("20");
						Thread.sleep(1000);
						Select SelectTradinesscompute=new Select(GraceTradinessComputation);
						SelectTradinesscompute.selectByVisibleText("Ignore Break Tardiness");
						Thread.sleep(1000);
						AdjustmentOfTradinessEarlyBreak.click();
						Thread.sleep(1000);
						EarlyBreakTime.click();
						Thread.sleep(1000);
						boolean selectType3 = EarlyBreakComputation.isSelected();
						//performing click operation only if element is not selected
						if(selectType3 == false) {
							EarlyBreakComputation.click();
						}
						Thread.sleep(1000);
						
						Select SelectEarlyBreakComputationMethod=new Select(EarlyBreakComputationMethod);
						SelectEarlyBreakComputationMethod.selectByVisibleText("Actual Early Break Consider as OT");
						Thread.sleep(1000);
						OverTime.click();
						Thread.sleep(1000);
						boolean selectType4 = OtapplicableYes.isSelected();
						if(selectType4 == false) {
							OtapplicableYes.click();
						}
						Thread.sleep(1000);
						boolean selectType5 = OtBeforeTime.isSelected();
						if(selectType5 == false) {
							OtBeforeTime.click();
						}
						Thread.sleep(1000);
						
						boolean selectType6 = qualifiMinOt.isSelected();
						if(selectType6 == false) {
							qualifiMinOt.click();
						}
						Thread.sleep(1000);
						MinimumOt.sendKeys("30");
						Thread.sleep(1000);
						
						boolean selectType7 = OverTimeIgnoreot.isSelected();
						if(selectType7 == false) {
							OverTimeIgnoreot.click();
						}
						Thread.sleep(1000);
						
						boolean selectType8 = PayOutOt.isSelected();
						if(selectType8 == false) {
							PayOutOt.click();
						}
						Thread.sleep(1000);
						
						boolean selectType9 = ToilRegular.isSelected();
						if(selectType9 == false) {
							ToilRegular.click();
						}
						Thread.sleep(1000);
						
						boolean selectTypes = CalEndDay.isSelected();
						if(selectTypes == false) {
							CalEndDay.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType11 = NightDiffYes.isSelected();
						if(selectType11 == false) {
							NightDiffYes.click();
						}
						
						HoliBuffIn.click();
						clock1.click();
						Thread.sleep(1000);
						clock2.click();
						Thread.sleep(1000);
						HoliBuffInOut.click();
					
						
						clock3.click();
						Thread.sleep(1000);
						
						clock4.click();
						Thread.sleep(1000);
						
						Thread.sleep(5000);
						if(permissionLink.isDisplayed()) {
						permissionLink.click();
						Thread.sleep(1000);
						boolean RulesChecking = PresentRulesChecking.isSelected();
						if(RulesChecking == false) {
							PresentRulesChecking.click();
						}
						Thread.sleep(1000);
						HalfDayPresent.sendKeys("5");
						Thread.sleep(1000);
						boolean RulesChecking2 = FullDayPresentRulesChecking.isSelected();
						if(RulesChecking2 == false) {
							FullDayPresentRulesChecking.click();
						}
						Thread.sleep(1000);
						FullDayPresentMin.sendKeys("23");
						Thread.sleep(1000);
						EarlyGoingIsGreaterThan.sendKeys("3");
						Thread.sleep(1000);
						LateEntryIsGreaterThan.sendKeys("5");
						Thread.sleep(1000);
						SecondHalfLateEntryGreaterThan.sendKeys("5");
						Thread.sleep(1000);
						SecondHalfEarlyGoingGreaterThan.sendKeys("4");
						Thread.sleep(1000);
						SummaryPermissibleLateEntryInAMonth.sendKeys("2");
						Thread.sleep(1000);
						SummaryPermissibleEarlyGoingInAMonth.sendKeys("3");
						Thread.sleep(1000);
						SummaryCountedForAdjustment.sendKeys("2");
						Thread.sleep(1000);
						SummaryDaysToBeAdjustedInLE.sendKeys("2");
						Thread.sleep(1000);
						SummaryOccuranceBeCountedForAdjustment.sendKeys("2");
						Thread.sleep(1000);
						SummaryAdjustedInEE.sendKeys("2");
						Thread.sleep(1000);
						SummaryPermissionHoursmin.sendKeys("2");
						Thread.sleep(1000);
						SummaryNoofPermissionAllowedMonth.sendKeys("2");
						Thread.sleep(1000);
						}
						else
						{
							System.out.println("Permission link not present");
						}
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollBy(0,-250)");
						Thread.sleep(3500);
						FormMenu.click();
						Thread.sleep(1000);
						LeaveForm.sendKeys("2");
						Thread.sleep(1000);
						OverTimeForm.sendKeys("6");
						Thread.sleep(1000);
						RestDayForm.sendKeys("8");
						Thread.sleep(1000);
						TimeLogForm.sendKeys("7");
						Thread.sleep(1000);
						Odform.sendKeys("9");
						Thread.sleep(1000);
						ShiftForm.sendKeys("7");
						Thread.sleep(1000);
						permissform.sendKeys("5");
						Thread.sleep(1000);
				
						
				saveButton.click();
				Thread.sleep(1000);
				return true;
				}catch(Exception e) {
					System.out.println("unable to get the flow");
				}
				return false;
				
			}
			
			
			
			public String PolicyNameMandatoryFieldCheck(String poliDescription) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(500);
				AddAttentPolicy.click();
//				Thread.sleep(1000);
//				attendancePolicyInput.sendKeys(policy);
				Thread.sleep(500);
				PolicyDescription.sendKeys(poliDescription);
				Thread.sleep(500);
				TradinessMenu.click();
				Thread.sleep(500);
//                boolean selectType = FlexIn.isSelected();
//				//performing click operation only if element is not selected
//				if(selectType == false) {
//					FlexIn.click();
//				}
//				Thread.sleep(1000);
//				FlexInMin.sendKeys("20");
//				Thread.sleep(1000);
//				 boolean selectType1 = GraceIn.isSelected();
//					//performing click operation only if element is not selected
//					if(selectType1 == false) {
//						GraceIn.click();
//					}
//					Thread.sleep(1000);
//					GraceInMin.sendKeys("30");
//					Thread.sleep(1000);
//					Select Selectmonth=new Select(TradinessCompution);
//					Selectmonth.selectByVisibleText("Ignore Tardiness");
//					Thread.sleep(1000);
//					 boolean selectType2 = GraceIn.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType2 == false) {
//							AdjustmentofTradiness.click();
//						}
//						Thread.sleep(1000);
//						UnderTime.click();
//						Thread.sleep(1000);
//						FlexOut.click();
//						Thread.sleep(1000);
//						FlexiOutMin.sendKeys("30");
//						Thread.sleep(1000);
//						GraceOut.click();
//						Thread.sleep(1000);
//						GraceOutTime.sendKeys("40");
//						Thread.sleep(1000);
//						Select SelectGraceout=new Select(UnderTimeCompute);
//						SelectGraceout.selectByVisibleText("Ignore Undertime");
//						Thread.sleep(1000);
//						AdjustUnderTime.click();
//						Thread.sleep(1000);
//						TradinessBreakTime.click();
//						Thread.sleep(1000);
//						GraceTimeBreakApplicity.click();
//						Thread.sleep(1000);
//						GraceTimeBreakInMin.sendKeys("20");
//						Thread.sleep(1000);
//						Select SelectTradinesscompute=new Select(GraceTradinessComputation);
//						SelectTradinesscompute.selectByVisibleText("Ignore Break Tardiness");
//						Thread.sleep(1000);
//						AdjustmentOfTradinessEarlyBreak.click();
//						Thread.sleep(1000);
//						EarlyBreakTime.click();
//						Thread.sleep(1000);
//						boolean selectType3 = EarlyBreakComputation.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType3 == false) {
//							EarlyBreakComputation.click();
//						}
//						Thread.sleep(1000);
//						
//						Select SelectEarlyBreakComputationMethod=new Select(EarlyBreakComputationMethod);
//						SelectEarlyBreakComputationMethod.selectByVisibleText("Actual Early Break Consider as OT");
//						Thread.sleep(1000);
//						OverTime.click();
//						Thread.sleep(1000);
//						boolean selectType4 = OtapplicableYes.isSelected();
//						if(selectType4 == false) {
//							OtapplicableYes.click();
//						}
//						Thread.sleep(1000);
//						boolean selectType5 = OtBeforeTime.isSelected();
//						if(selectType5 == false) {
//							OtBeforeTime.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType6 = qualifiMinOt.isSelected();
//						if(selectType6 == false) {
//							qualifiMinOt.click();
//						}
//						Thread.sleep(1000);
//						MinimumOt.sendKeys("30");
//						Thread.sleep(1000);
//						
//						boolean selectType7 = OverTimeIgnoreot.isSelected();
//						if(selectType7 == false) {
//							OverTimeIgnoreot.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType8 = PayOutOt.isSelected();
//						if(selectType8 == false) {
//							PayOutOt.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType9 = ToilRegular.isSelected();
//						if(selectType9 == false) {
//							ToilRegular.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectTypes = CalEndDay.isSelected();
//						if(selectTypes == false) {
//							CalEndDay.click();
//						}
//						Thread.sleep(1000);
//						
//						
//						boolean selectType11 = NightDiffYes.isSelected();
//						if(selectType11 == false) {
//							NightDiffYes.click();
//						}
//						
////						HoliBuffIn.click();
////						clock1.click();
////						Thread.sleep(1000);
////						HoliBuffInOut.sendKeys("12:45");
//						
//						Thread.sleep(10000);
//						FormMenu.click();
//						Thread.sleep(1000);
//						LeaveForm.sendKeys("2");
//						Thread.sleep(1000);
//						OverTimeForm.sendKeys("6");
//						Thread.sleep(1000);
//						RestDayForm.sendKeys("8");
//						Thread.sleep(1000);
//						TimeLogForm.sendKeys("7");
//						Thread.sleep(1000);
//						Odform.sendKeys("9");
//						Thread.sleep(1000);
//						ShiftForm.sendKeys("7");
//						Thread.sleep(1000);
//						permissform.sendKeys("5");
						Thread.sleep(1000);
				saveButton.click();
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String PolicyDescriptionMandatoryFieldCheck(String policy) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(500);
				AddAttentPolicy.click();
				Thread.sleep(500);
				attendancePolicyInput.sendKeys(policy);
				Thread.sleep(500);
//				PolicyDescription.sendKeys(poliDescription);
//				Thread.sleep(1000);
				TradinessMenu.click();
//				Thread.sleep(1000);
//                boolean selectType = FlexIn.isSelected();
//				//performing click operation only if element is not selected
//				if(selectType == false) {
//					FlexIn.click();
//				}
//				Thread.sleep(1000);
//				FlexInMin.sendKeys("20");
//				Thread.sleep(1000);
//				 boolean selectType1 = GraceIn.isSelected();
//					//performing click operation only if element is not selected
//					if(selectType1 == false) {
//						GraceIn.click();
//					}
//					Thread.sleep(1000);
//					GraceInMin.sendKeys("30");
//					Thread.sleep(1000);
//					Select Selectmonth=new Select(TradinessCompution);
//					Selectmonth.selectByVisibleText("Ignore Tardiness");
//					Thread.sleep(1000);
//					 boolean selectType2 = GraceIn.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType2 == false) {
//							AdjustmentofTradiness.click();
//						}
//						Thread.sleep(1000);
//						UnderTime.click();
//						Thread.sleep(1000);
//						FlexOut.click();
//						Thread.sleep(1000);
//						FlexiOutMin.sendKeys("30");
//						Thread.sleep(1000);
//						GraceOut.click();
//						Thread.sleep(1000);
//						GraceOutTime.sendKeys("40");
//						Thread.sleep(1000);
//						Select SelectGraceout=new Select(UnderTimeCompute);
//						SelectGraceout.selectByVisibleText("Ignore Undertime");
//						Thread.sleep(1000);
//						AdjustUnderTime.click();
//						Thread.sleep(1000);
//						TradinessBreakTime.click();
//						Thread.sleep(1000);
//						GraceTimeBreakApplicity.click();
//						Thread.sleep(1000);
//						GraceTimeBreakInMin.sendKeys("20");
//						Thread.sleep(1000);
//						Select SelectTradinesscompute=new Select(GraceTradinessComputation);
//						SelectTradinesscompute.selectByVisibleText("Ignore Break Tardiness");
//						Thread.sleep(1000);
//						AdjustmentOfTradinessEarlyBreak.click();
//						Thread.sleep(1000);
//						EarlyBreakTime.click();
//						Thread.sleep(1000);
//						boolean selectType3 = EarlyBreakComputation.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType3 == false) {
//							EarlyBreakComputation.click();
//						}
//						Thread.sleep(1000);
//						
//						Select SelectEarlyBreakComputationMethod=new Select(EarlyBreakComputationMethod);
//						SelectEarlyBreakComputationMethod.selectByVisibleText("Actual Early Break Consider as OT");
//						Thread.sleep(1000);
//						OverTime.click();
//						Thread.sleep(1000);
//						boolean selectType4 = OtapplicableYes.isSelected();
//						if(selectType4 == false) {
//							OtapplicableYes.click();
//						}
//						Thread.sleep(1000);
//						boolean selectType5 = OtBeforeTime.isSelected();
//						if(selectType5 == false) {
//							OtBeforeTime.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType6 = qualifiMinOt.isSelected();
//						if(selectType6 == false) {
//							qualifiMinOt.click();
//						}
//						Thread.sleep(1000);
//						MinimumOt.sendKeys("30");
//						Thread.sleep(1000);
//						
//						boolean selectType7 = OverTimeIgnoreot.isSelected();
//						if(selectType7 == false) {
//							OverTimeIgnoreot.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType8 = PayOutOt.isSelected();
//						if(selectType8 == false) {
//							PayOutOt.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType9 = ToilRegular.isSelected();
//						if(selectType9 == false) {
//							ToilRegular.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectTypes = CalEndDay.isSelected();
//						if(selectTypes == false) {
//							CalEndDay.click();
//						}
//						Thread.sleep(1000);
//						
//						
//						boolean selectType11 = NightDiffYes.isSelected();
//						if(selectType11 == false) {
//							NightDiffYes.click();
//						}
//						
////						HoliBuffIn.sendKeys("13:45");
////						Thread.sleep(1000);
////						HoliBuffInOut.sendKeys("12:45");
//						
//						Thread.sleep(10000);
//						FormMenu.click();
//						Thread.sleep(1000);
//						LeaveForm.sendKeys("2");
//						Thread.sleep(1000);
//						OverTimeForm.sendKeys("6");
//						Thread.sleep(1000);
//						RestDayForm.sendKeys("8");
//						Thread.sleep(1000);
//						TimeLogForm.sendKeys("7");
//						Thread.sleep(1000);
//						Odform.sendKeys("9");
//						Thread.sleep(1000);
//						ShiftForm.sendKeys("7");
//						Thread.sleep(1000);
//						permissform.sendKeys("5");
						Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
			}
			
			public boolean ResetBtnPolicy(String policy,String poliDescription) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(500);
				AddAttentPolicy.click();
				Thread.sleep(500);
				attendancePolicyInput.sendKeys(policy);
				Thread.sleep(500);
				PolicyDescription.sendKeys(poliDescription);
				Thread.sleep(500);
//				TradinessMenu.click();
//				Thread.sleep(1000);
//                boolean selectType = FlexIn.isSelected();
//				//performing click operation only if element is not selected
//				if(selectType == false) {
//					FlexIn.click();
//				}
//				Thread.sleep(1000);
//				FlexInMin.sendKeys("20");
//				Thread.sleep(1000);
//				 boolean selectType1 = GraceIn.isSelected();
//					//performing click operation only if element is not selected
//					if(selectType1 == false) {
//						GraceIn.click();
//					}
//					Thread.sleep(1000);
//					GraceInMin.sendKeys("30");
//					Thread.sleep(1000);
//					Select Selectmonth=new Select(TradinessCompution);
//					Selectmonth.selectByVisibleText("Ignore Tardiness");
//					Thread.sleep(1000);
//					 boolean selectType2 = GraceIn.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType2 == false) {
//							AdjustmentofTradiness.click();
//						}
//						Thread.sleep(1000);
//						UnderTime.click();
//						Thread.sleep(1000);
//						FlexOut.click();
//						Thread.sleep(1000);
//						FlexiOutMin.sendKeys("30");
//						Thread.sleep(1000);
//						GraceOut.click();
//						Thread.sleep(1000);
//						GraceOutTime.sendKeys("40");
//						Thread.sleep(1000);
//						Select SelectGraceout=new Select(UnderTimeCompute);
//						SelectGraceout.selectByVisibleText("Ignore Undertime");
//						Thread.sleep(1000);
//						AdjustUnderTime.click();
//						Thread.sleep(1000);
//						TradinessBreakTime.click();
//						Thread.sleep(1000);
//						GraceTimeBreakApplicity.click();
//						Thread.sleep(1000);
//						GraceTimeBreakInMin.sendKeys("20");
//						Thread.sleep(1000);
//						Select SelectTradinesscompute=new Select(GraceTradinessComputation);
//						SelectTradinesscompute.selectByVisibleText("Ignore Break Tardiness");
//						Thread.sleep(1000);
//						AdjustmentOfTradinessEarlyBreak.click();
//						Thread.sleep(1000);
//						EarlyBreakTime.click();
//						Thread.sleep(1000);
//						boolean selectType3 = EarlyBreakComputation.isSelected();
//						//performing click operation only if element is not selected
//						if(selectType3 == false) {
//							EarlyBreakComputation.click();
//						}
//						Thread.sleep(1000);
//						
//						Select SelectEarlyBreakComputationMethod=new Select(EarlyBreakComputationMethod);
//						SelectEarlyBreakComputationMethod.selectByVisibleText("Actual Early Break Consider as OT");
//						Thread.sleep(1000);
//						OverTime.click();
//						Thread.sleep(1000);
//						boolean selectType4 = OtapplicableYes.isSelected();
//						if(selectType4 == false) {
//							OtapplicableYes.click();
//						}
//						Thread.sleep(1000);
//						boolean selectType5 = OtBeforeTime.isSelected();
//						if(selectType5 == false) {
//							OtBeforeTime.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType6 = qualifiMinOt.isSelected();
//						if(selectType6 == false) {
//							qualifiMinOt.click();
//						}
//						Thread.sleep(1000);
//						MinimumOt.sendKeys("30");
//						Thread.sleep(1000);
//						
//						boolean selectType7 = OverTimeIgnoreot.isSelected();
//						if(selectType7 == false) {
//							OverTimeIgnoreot.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType8 = PayOutOt.isSelected();
//						if(selectType8 == false) {
//							PayOutOt.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType9 = ToilRegular.isSelected();
//						if(selectType9 == false) {
//							ToilRegular.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectTypes = CalEndDay.isSelected();
//						if(selectTypes == false) {
//							CalEndDay.click();
//						}
//						Thread.sleep(1000);
//						
//						
//						boolean selectType11 = NightDiffYes.isSelected();
//						if(selectType11 == false) {
//							NightDiffYes.click();
//						}
//						
//						HoliBuffIn.click();
//						clock1.click();
//						Thread.sleep(1000);
//						clock2.click();
//						Thread.sleep(1000);
//						HoliBuffInOut.click();
//					
//						
//						clock3.click();
//						Thread.sleep(1000);
//						
//						clock4.click();
//						Thread.sleep(1000);
//						
//						Thread.sleep(2000);
//						FormMenu.click();
//						Thread.sleep(1000);
//						LeaveForm.sendKeys("2");
//						Thread.sleep(1000);
//						OverTimeForm.sendKeys("6");
//						Thread.sleep(1000);
//						RestDayForm.sendKeys("8");
//						Thread.sleep(1000);
//						TimeLogForm.sendKeys("7");
//						Thread.sleep(1000);
//						Odform.sendKeys("9");
//						Thread.sleep(1000);
//						ShiftForm.sendKeys("7");
//						Thread.sleep(1000);
//						permissform.sendKeys("5");
//						Thread.sleep(1000);
				//saveButton.click();
						resetButton.click();
				
				return true;
				
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(1000);
				
				
				boolean flag = false;
		        try {
		            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
		            if (element.isDisplayed() || element.isEnabled())
//		                flag = false;
		                nextButton.click();
		            System.out.println("next button visible");
		        } catch (NoSuchElementException e) {
//		            flag = true;
		            System.out.println("next button not visible");
		        } 
		        return flag;
				
			}
			
			public Boolean searchAttendentPolicyNamepagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				attendancePolicylink.click();
				Thread.sleep(1000);
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


