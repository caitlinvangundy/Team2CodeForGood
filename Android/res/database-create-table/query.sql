# getUpcomingOpportunities()
SELECT * FROM opportunity ORDER BY date LIMIT 10 DESC
int theOpportunityID, int theUserID)
INSERT INTO registration (opportunityID, userID, date) VALUES (theOpportunityID, theUserID, NOW())

# deleteRegistration(int theOpportunityID, int theUserID)
DELETE FROM registration WHERE opportunityID=theOpportunityID AND userID=theUserID

# getOpportunitiesForUser(int userID)
SELECT registration.opportunityID FROM registration INNER JOIN opportunity ON registration.opportunityID=opportunity.id WHERE registration.userID=userID

# getUsersForOpportunity(int opportunityID)
SELECT registration.userID FROM registration INNER JOIN user ON registration.userID=user.id WHERE registration.opportunityID=opportunityID

# getUserByUsername(username)
SELECT * FROM user WHERE user.username=username