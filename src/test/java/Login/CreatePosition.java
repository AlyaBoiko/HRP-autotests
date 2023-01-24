package Login;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.nio.charset.Charset;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class CreatePosition {
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    private ClientPositionForm clientPositionForm = new ClientPositionForm();
    private InternalPositionForm internalPositionForm = new InternalPositionForm();
    private BenchPositionForm benchPositionForm = new BenchPositionForm();
    private PreOfferPositionForm preOfferPositionForm = new PreOfferPositionForm();
    private TraineePositionForm traineePositionForm = new TraineePositionForm();

    @BeforeClass
    private void setup(){
        Configuration.timeout = 50000;
    }

    @Test
    public void CreateClientProjectPosition(){
        clientPositionForm.CreateClientProjectPosition();
    }

    @Test
    public void CreateInternalProjectPosition(){
        internalPositionForm.CreateInternalProjectPosition();
    }


    @Test
    public void CreateBenchPosition(){
        benchPositionForm.CreateBenchPosition();
    }

    @Test
    public void CreatePreOfferPosition() {
        preOfferPositionForm.CreatePreOfferPosition();
    }

    @Test
    public void CreateTraineePosition() {
        traineePositionForm.CreateTraineePosition();

    }

}
