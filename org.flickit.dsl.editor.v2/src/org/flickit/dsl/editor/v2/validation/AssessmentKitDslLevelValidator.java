package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Level;

public class AssessmentKitDslLevelValidator extends AbstractAssessmentKitDslValidator {

	public static final int COMPETENCE_VALUE_MIN = 0;
	public static final int COMPETENCE_VALUE_MAX = 100;

	@Check
	public void checkCompetenceValueNotOutOfRange(Level level) {
		if (hasCompetenceValueLessThanMin(level)) {
			error("Competence value may not be less than " + COMPETENCE_VALUE_MIN, AssessmentKitDslPackage.Literals.LEVEL__COMPETENCE);
		}

		if (hasCompetenceValueMoreThanMax(level)) {
			error("Competence value may not be more than " + COMPETENCE_VALUE_MAX, AssessmentKitDslPackage.Literals.LEVEL__COMPETENCE);
		}
	}

	private boolean hasCompetenceValueLessThanMin(Level level) {
		return level.getCompetence().stream()
				.anyMatch(c -> c.getCompetenceValues().stream()
						.anyMatch(v -> v.getValue() < COMPETENCE_VALUE_MIN));
	}

	private boolean hasCompetenceValueMoreThanMax(Level level) {
		return level.getCompetence().stream()
				.anyMatch(c -> c.getCompetenceValues().stream()
						.anyMatch(v -> v.getValue() > COMPETENCE_VALUE_MAX));
	}
}
