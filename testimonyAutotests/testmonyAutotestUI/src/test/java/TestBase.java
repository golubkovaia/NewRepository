import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    protected final manager.ApplicationManager applicationManager = new manager.ApplicationManager();

    @BeforeEach //метод, помеченный данной аннотацией JUnit, будет выполняться перед каждым тестом @Test

    public void setupPage() throws InterruptedException {
        applicationManager.init();
    }

    @AfterEach //метод, помеченный данной аннотацией JUnit, будет выполняться после каждого теста @Test

    public void closePage() {
        applicationManager.close();
    }

}