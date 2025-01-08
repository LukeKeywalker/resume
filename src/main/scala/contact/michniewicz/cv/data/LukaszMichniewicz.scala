package contact.michniewicz.cv.data

import contact.michniewicz.cv.model.SkillLevel.{Beginner, Expert, Intermediate}
import contact.michniewicz.cv.model.{Resume, Skill, SkillCategory, SkillLevel}

object LukaszMichniewicz:
  val resume: Resume = Resume(
    name = "Łukasz",
    surname = "Michniewicz",
    email = "lukasz.michniewicz@gmail.com",
    linkedin = "https://www.linkedin.com/in/lmichniewicz/",
    github = "https://github.com/LukeKeywalker",
    role = "Fullstack Software Engineer",
    logo = "https://avatars.githubusercontent.com/u/3268404?v=4",
    bio = List(
      """
        | I specialize in building full-stack, serverless solutions for AWS Serverless Computing in Scala.
        | I also have experience writing Java for large scale, distributed systems deployed to Kubernetes clusters, and
        | building multi-agent, continuous deployment pipelines.
      """.stripMargin,
      """
        | Throughout 15 years of my professional career as a software engineer I strived for optimizing productivity
        | and developer experience, and worked towards full stack skill set to efficiently build web applications in
        | small teams, and to deploy them in a scalable manner according to best DevOps practices independently from
        | dedicated DevOps department.
      """.stripMargin,
      """
        | I am available for hiring so feel free to send me a message if you want my input on how to set-up
        | your next project for agile development in small team without large upfront infrastructure cost or if you
        | have an open full-time position that matches my experience and skills.
        |""".stripMargin
    ),
    skillCategories = List(
      SkillCategory(
        "Backend Programming",
        List(
          Skill("Scala", Expert),
          Skill("Akka", Expert),
          Skill("FS2", Intermediate),
          Skill("Java", Expert),
          Skill("Springboot", Expert),
          Skill("GraalVM", Expert)
        )
      ),
      SkillCategory(
        "Frontend Programming",
        List(
          Skill("Scala.js", Expert),
          Skill("JavaScript/TypeScript", Intermediate),
          Skill("LaminarUI", Expert),
          Skill("React", Intermediate),
          Skill("CSS", Intermediate),
          Skill("Tailwind", Intermediate)
        )
      ),
      SkillCategory(
        "Databases",
        List(
          Skill("DynamoDB", Expert),
          Skill("Cassandra", Intermediate),
          Skill("PostgreSQL", Intermediate)
        )
      ),
      SkillCategory(
        "Infrastructure",
        List(
          Skill("AWS Serverless Computing", Expert),
          Skill("CDK", Expert),
          Skill("Kubernetes", Intermediate)
        )
      ),
      SkillCategory(
        "DevOps",
        List(
          Skill("Jenkins", Expert),
          Skill("GitLab", Expert),
          Skill("ArgoCD", Intermediate)
        )
      ),
      SkillCategory(
        "Others",
        List(
          Skill("Git", Expert),
          Skill("Bash", Intermediate),
          Skill("Unity 3D", Expert),
          Skill("C#", Intermediate),
          Skill("Unreal Engine", Intermediate),
          Skill("C/C++", Intermediate),
          Skill("Python", Intermediate),
          Skill("Jupyter Notebook", Intermediate),
          Skill("NumPy", Beginner),
          Skill("PyTorch", Beginner),
          Skill("YOLOv10", Beginner),
          Skill("OpenCV", Beginner)
        )
      )
    )
  )
