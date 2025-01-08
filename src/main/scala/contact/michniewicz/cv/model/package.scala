package contact.michniewicz.cv

import scala.scalajs.js.Date

package object model:
  enum SkillLevel(val level: Int):
    case Beginner     extends SkillLevel(1)
    case Intermediate extends SkillLevel(2)
    case Expert       extends SkillLevel(3)

  case class SkillCategory(name: String, skills: List[Skill])

  case class Skill(name: String, rating: SkillLevel)

  case class ContactInfo(linkedIn: String, gitHub: String)

  case class WorkExperience(company: String, position: String, from: Date, until: Option[Date])

  case class Resume(
      name: String,
      surname: String,
      email: String,
      linkedin: String,
      github: String,
      role: String,
      bio: List[String],
      logo: String,
      skillCategories: List[SkillCategory]
  ) {
    def fullName = s"$name $surname"
    def initials = s"${name.headOption.getOrElse("")}${surname.headOption.getOrElse("")}"
  }
