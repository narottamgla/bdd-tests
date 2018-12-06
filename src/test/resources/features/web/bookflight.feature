Feature:  Book Flight with emirates
	
Scenario: Bill wants to travel from DXB to LHR
	Given that Bill has decided to check available flights 
	When he looks at a return trip from "DXB" to "LHR" leaving one week from now 
	Then he should be shown the cheapest return ticket from DXB to LHR 