package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.BaseInfo;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Question;

@ComposedChecks(validators = {
		AssessmentKitDslLevelValidator.class,
		AssessmentKitDslSubjectValidator.class,
		AssessmentKitDslAttributeValidator.class,
		AssessmentKitDslQuestionnaireValidator.class,
		AssessmentKitDslQuestionValidator.class
})
public class AssessmentKitDslValidator extends AbstractAssessmentKitDslValidator {

	public static final int NAME_MAX_LENGTH = 50;
	public static final int TITLE_MAX_LENGTH = 100;

	@Check
	public void checkNameLength(BaseInfo info) {
		if (info.getName() == null || info.getName().length() > NAME_MAX_LENGTH)
			error(String.format("'Name' length may not be more than %d!", NAME_MAX_LENGTH),
					AssessmentKitDslPackage.Literals.BASE_INFO__NAME);
	}

	@Check
	public void checkTitleNotEmpty(BaseInfo info) {
		if (info.getTitle() == null || info.getTitle().isBlank())
			error("'Title' may not be empty!",
					AssessmentKitDslPackage.Literals.BASE_INFO__TITLE);
	}

	@Check
	public void checkTitleLength(BaseInfo info) {
		if (!(info instanceof Question))
			if (info.getTitle() == null || info.getTitle().length() > TITLE_MAX_LENGTH)
				error(String.format("'Title' length may not be more than %d!", TITLE_MAX_LENGTH),
						AssessmentKitDslPackage.Literals.BASE_INFO__TITLE);
	}
}
