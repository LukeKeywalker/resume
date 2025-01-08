package contact.michniewicz.cv.element

import com.raquo.laminar.api.L.{Element, className, div, h3, i, span, given}
import contact.michniewicz.cv.element.App.interface
import contact.michniewicz.cv.{element, model}
import contact.michniewicz.cv.model.{Resume, Skill, SkillCategory}

object Skills:
  def render(data: Resume)(): Element = interface match
    case element.Interface.Desktop => Desktop.render(data)
    case element.Interface.Mobile  => Mobile.render(data)

  private object Desktop:
    def render(data: Resume): Element = div(
      className := "section1 p-30",
      div(
        className := "sec-title",
        div(className := "pg-sub-title", "Resume"),
        div(className := "pg-title", "Skills")
      ),
      div(
        renderSkills(data.skillCategories)
      )
    )

  private object Mobile:
    def render(data: Resume): Element = div(
      className := "section1 p-30",
      div(
        renderSkills(data.skillCategories)
      )
    )

  private def renderSkills(skillCategories: List[SkillCategory]): Element = div(
    className := "flex-1",
    skillCategories.map(skillCategory => renderSkillCategory(skillCategory))
  )

  private def renderSkillCategory(skillCategory: SkillCategory): Element = div(
    className := "skill-category p-5",
    h3(skillCategory.name),
    skillCategory.skills.map(skillTag)
  )

  private def skillTag(skill: Skill): Element = div(
    className := "skill",
    span(skill.name),
    span(
      className := "skill-rating p-5",
      LazyList.tabulate(3)(idx => i(className := s"fa ${if (skill.rating.level > idx) "fa-star" else "fa-star-o"}"))
    )
  )
