package modèle;

import androidx.annotation.NonNull;
import java.util.List;
// Grâce à cette classe, je vais créer la structure de mes questions
public class Question {
    // 3 variables sont nécessaires pour décrire ma question
    // mQuestion de type String : la question posée
    // mChoiceList de type List de String : les réponses possibles
    // m AnswerIndex : un index qui permet de savoir quelle est la bonne réponse dans la liste
    private final String mQuestion;
    private final List<String> mChoiceList;
    private final int mAnswerIndex;
    // Même nom que la classe : c'est le constructeur pour mes objets
    // Je construis mes objets Questions grâce aux trois variables déclarées juste avant
    // Chaque objet question crée sera donc construit selon cette structure
    // Le @NonNull signifie que chaque paramètre NE PEUT PAS être de valeur Null
    public Question(String question, List<String> choiceList, int answerIndex) {
        mQuestion = question;
        mChoiceList = choiceList;
        mAnswerIndex = answerIndex;
    }
    // Ici mes Getters pour me retourner mes variables : noter le return de la variable déclarée à chaque fois
    // Vous noterez qu'il n'y pas de Setters : c'est normal puisque mes questions ne seront pas modifiées
    // En effet, les questions seront créent en dur dans la GameActivity
    // Si je faisais un mapping Objet / Relationnel avec une base de données, il faudrait certainement le faire
    @NonNull
    public String getQuestion() {
        return mQuestion;
    }
    @NonNull
    public List<String> getChoiceList() {
        return mChoiceList;
    }
    public int getAnswerIndex() {
        return mAnswerIndex;
    }
}