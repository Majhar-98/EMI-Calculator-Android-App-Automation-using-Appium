import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EMITestRunner extends Setup {
    @BeforeTest
    public void startEMICalc(){
        EMIPage emiPage = new EMIPage(driver);
        emiPage.btnStart.click();
    }

    }
    @Test(dataProvider = "data-provider", dataProviderClass = DataSet.class)

    public void calculateEMI(int loanAmount, double interest,int emi,double processingFee,int monthlyEmi,double totalInterest,int processingFeeTotal,double totalPayment,int year,int month) throws InterruptedException {
        EMIPage emiPage = new EMIPage(driver);
        emiPage.btnPeriod.click();

        emiPage.calculateEMI(loanAmount,interest,emi,processingFee);
        double monthlyEMIActual = Double.parseDouble(emiPage.txtEMIMonthlyAmountResult.getText().replace(",", ""));
        double totalInterestActual = Double.parseDouble(emiPage.txtTotalInterestResult.getText().replace(",", ""));
        int totalProcessingFeeActual = Integer.parseInt(emiPage.txtProcessingFeeResult.getText().replace(",", ""));
        double totalPaymentActual = Double.parseDouble(emiPage.txtTotalPaymentResult.getText().replace(",", ""));
        int yearPeriodActual =Integer.parseInt(emiPage.txtYear.getText());
        int monthPeriodActual =Integer.parseInt(emiPage.txtMonth.getText());
        Thread.sleep(20000);

        Assert.assertEquals(monthlyEMIActual,monthlyEmi);
        Assert.assertEquals(totalInterestActual,totalInterest);
        Assert.assertEquals(totalProcessingFeeActual,processingFeeTotal);
        Assert.assertEquals(totalPaymentActual,totalPayment);
        Assert.assertEquals(yearPeriodActual,year);
        Assert.assertEquals(monthPeriodActual,month);
        emiPage.btnReset.click();
        Thread.sleep(5000);

    }





}
