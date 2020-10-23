package com.test.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

 


@RunWith(Suite.class)				
@Suite.SuiteClasses({				
	CommaContentTest.class,
	ContentAggregatorTest.class,
	ContentTest.class,
	PipeContentTest.class,
	SpaceContentTest.class
})
public class AllTests {

}
