package com.lsc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	@Test
	public void testExportColaboradoresToExcel() {
		try {
			App.exportColaboradoresToExcel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
