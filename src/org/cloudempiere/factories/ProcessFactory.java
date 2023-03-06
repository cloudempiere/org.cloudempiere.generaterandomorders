package org.cloudempiere.factories;

import org.adempiere.base.IProcessFactory;
import org.cloudempiere.process.GenerateRandomDataCOrder;
import org.compiere.process.ProcessCall;

public class ProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {
        if (GenerateRandomDataCOrder.class.getName().equals(className))
            return new GenerateRandomDataCOrder();
		return null;
	}

}
