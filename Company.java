class TechLead
{
  int developerRequirement ()
  {
    int total_requirement = 29;
      return total_requirement;
  }
  void projectStatus()
  {
    int completed = 20, incomplete = 10;
      System.out.println("Completed no. of projects AND Incomplete no. of projects:"+completed + " " +incomplete);
      
  }
  String feedback ()
  {
    String feed = "";
    return feed;
  }
}


  class ProjectManager extends TechLead
  {
      String clientInteraction()
      {
          String interact = "";
          return interact;
      }
      
      double payment()
      {
          double amount=7650.50;
          return amount;
      }
  }
  
  class TeamLead{
      String code()
      {
          String program = "";
          return program;
      }
      String issues()
      {
          String resolvedIssue = "";
          return resolvedIssue;
      }
      String projectMgmt()
      {
          String mgmt = "";
          return mgmt;
      }
      
  }
  
  
  class Developer extends TeamLead{
      boolean testing()
      {
          boolean testResult = true;
          return testResult;
      }
  }



  public class Company
  {
    public static void main (String[]args)
    {
      TechLead techld = new TechLead();
      System.out.println("Total Number Of Developers Required :" + techld.developerRequirement());
      techld.projectStatus();
      System.out.println("Feedback :"+techld.feedback());
      
      
      ProjectManager pm=new ProjectManager();
      System.out.println("Client Interaction Report :"+pm.clientInteraction());
      System.out.println("Feedback :"+pm.feedback());
      System.out.println("Payment Amount Is:"+pm.payment());
      
      TeamLead tl=new TeamLead();
      String projectcode=tl.code();
      System.out.println("Issue Resolved Status:"+tl.issues());
      System.out.println("Projetc Management Report :"+tl.projectMgmt());
      
      Developer dev=new Developer();
      String devcode=dev.code();
      System.out.println("Testing Status :"+dev.testing());
    }
  }

