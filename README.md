# ua-sonarqube-sonarcloud
 Adapter can sync new issues like bug, code_smell, vulnerability; can sync new and updated hotspots.

## About:
- SonarQube/SonarCloud is an open-source platform that has been developed by SonarSource for constant inspection of code quality.<br>
- It performs static code analysis, which offers a detailed report of code smells, bugs, code duplications and vulnerabilities.<br> 
- SonarQube is meant to be integrated with on-premise solutions like GitHub Enterprise or BitBucket Server.<br>
- SonarCloud is meant to be integrated with cloud solutions like GiHub.com or BitBucketCloud.<br>

### Working Condition:
1. It can sync newly created issues but cannot sync updated issues due to API Limitation.<br>
2. It can sync new and updated hotspots (It lists all the values coz doesnt have filter query).<br>
3. It works better in unidirectional sync (Keep the conflict management strategy as none so the cache values get synced).<br>
4. The pagination attribute has been enabled.<br>
5. Attached a business script to concatenate textRange, Component and message to make a consolidated description.<br>
6. Also attached images of icons and logos of sonarqube and sonarcloud; modify according to your usecase:)<br>

#### Business Script Configuration:
- Copy paste the code from the groovy file.<br>
- Provide a descriptive name.<br>
- Select execution type as preMapValues.<br>
- Associate it with sonar application.<br>
