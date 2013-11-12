package com.output;

import com.output.Saurabh.*;
import com.output.Saurabh.impl.JsonOutputGenerator;
public class OutputHelper {
/*IOutputGenerator outputGenerator;*/
JsonOutputGenerator Joutput;


public JsonOutputGenerator getJoutput() {
	return Joutput;
}


public void setJoutput(JsonOutputGenerator joutput) {
	Joutput = joutput;
}


/*public IOutputGenerator getOutputGenerator() {
	return outputGenerator;
}

public void setOutputGenerator(IOutputGenerator outputGenerator) {
	this.outputGenerator = outputGenerator;
}
*/
public void generateOutput() {
	// TODO Auto-generated method stub
/*outputGenerator.generateOutput();*/
	Joutput.generateOutput();
}


	
}
