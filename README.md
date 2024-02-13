
# Table
parent : child_first   1 : N <br>
parent : child_second  1 : N

```SQL
SELECT
    parent.parent_id,
    parent.parent_name,
    child_first.child_first_id,
    child_first.child_first_name,
    child_second.child_second_id,
    child_second.child_second_name
FROM
    parent
LEFT JOIN
    child_first ON parent.parent_id = child_first.parent_id
LEFT JOIN
    child_second ON parent.parent_id = child_second.parent_id
```
<img width="938" alt="image" src="https://github.com/ryuutakariya/spring-experiment/assets/60653335/bcd2db8e-9404-4d1b-94dd-16b5ec245ac8">


# Response
```json
[
	{
		"parentId": 1,
		"parentName": "X",
		"childFirstList": [
			{
				"childFirstId": 1,
				"childFirstName": "A1"
			},
			{
				"childFirstId": 2,
				"childFirstName": "A2"
			}
		],
		"childSecondList": [
			{
				"childSecondId": 1,
				"childSecondName": "C1"
			},
			{
				"childSecondId": 2,
				"childSecondName": "C2"
			},
			{
				"childSecondId": 3,
				"childSecondName": "C3"
			}
		]
	},
	{
		"parentId": 2,
		"parentName": "Y",
		"childFirstList": [
			{
				"childFirstId": 3,
				"childFirstName": "B1"
			},
			{
				"childFirstId": 4,
				"childFirstName": "B2"
			},
			{
				"childFirstId": 5,
				"childFirstName": "B3"
			}
		],
		"childSecondList": [
			{
				"childSecondId": 4,
				"childSecondName": "D1"
			},
			{
				"childSecondId": 5,
				"childSecondName": "D2"
			}
		]
	}
]
```
