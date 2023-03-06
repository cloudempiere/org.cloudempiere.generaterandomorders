package org.cloudempiere.factories;

import org.adempiere.base.IProcessFactory;
import org.cloudempiere.process.GenerateTestDataCOrder;
import org.compiere.process.ProcessCall;

public class ProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {
		if("org.cloudempiere.process.GenerateTestDataCOrder".equals(className))
			return new GenerateTestDataCOrder();
		return null;
	}

}
