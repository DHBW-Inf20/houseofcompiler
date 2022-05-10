import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"AST"})

@Suite
@SuiteDisplayName("JavaSubset Compiler")
public class TestSuite {

}
