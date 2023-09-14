package com.abdulaziz.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.saudiflag,
            "Argentina" , "Saudi Arabia",
            "Armenia", "Austria",
            2

        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.somaliaflag,
            "Somalia" , "Saudi Arabia",
            "Armenia", "Austria",
            1

        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.polandflag,
            "Argentina" , "Poland",
            "Armenia", "Austria",
            2

        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.jordanflag,
            "Emirate" , "Saudi Arabia",
            "Kuwait", "Jordan",
            4

        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.kuwaitflag,
            "Libya" , "Jordan",
            "Kuwait", "Austria",
            3

        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.emirateflag,
            "Emirate" , "Sudan",
            "Armenia", "Kuwait",
            1

        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.tunisiaflag,
            "Turkey" , " Poland",
            "Armenia", "Tunisia",
            4

        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.austriaflag,
            "Argentina" , "Poland",
            "Armenia", "Austria",
            4

        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.libyaflag,
            "Afghanistan" , "Morocco",
            "Libya", "Armenia",
            3

        )
        questionsList.add(que9)

        return questionsList
    }
}