Feature: Forcast API 
	
Scenario: Verify forcast details using latitude and longitude
	Given i have valid API key 
	When i request forcast api with valid lat as "23.195299" and lang as "72.633362"
	Then response should have status code as 200 and content-type as JSON
	And response should contain "latitude" as field
    And response should contain "longitude" as field
    And response should contain "timezone" as field
    And response should contain "currently" as field
    And response should contain "minutely" as field
    And response should contain "hourly" as field
    And response should contain "daily" as field
    And response should contain "flags" as field
    And response should contain "offset" as field
   # And minutely object data array should have 61 items
    And hourly object data array should have 49 items
    And daily object data array should have 8 items
    
