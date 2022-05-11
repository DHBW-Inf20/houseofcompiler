import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectClasses({AST.TestRunner.class, TAST.TestRunner.class, CodeGen.TestRunner.class, All.TestRunner.class})

@Suite
@SuiteDisplayName("House of Compiler")
public class TestSuite {
}
