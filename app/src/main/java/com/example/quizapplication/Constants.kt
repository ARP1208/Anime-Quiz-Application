package com.example.quizapplication

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // Question 1
        val questionOne = Question(
            1,
            "What is the name of Domain Expansion of Saturo Gojo in Jujutsu Kaisen?",
            R.drawable.ic_question1,
            "Malevolent Shrine",
            "Coffin of the Iron Curtain",
            "Infinite Void",
            "Chimera Shadow Garden",
            3
        )

        questionList.add(questionOne)

        // Question 2
        val questionTwo = Question(
            2,
            "What is the name of final arc of Bleach manga/anime series?",
            R.drawable.ic_question2,
            "Soul Soceity Arc",
            "Thousand Year Blood War Arc",
            "Arrancar Arc",
            "The Lost Substitute Shinigami Arc",
            2
        )

        questionList.add(questionTwo)

        // Question 3
        val questionThree = Question(
            3,
            "What is the theme of Naruto?",
            R.drawable.ic_question3,
            "Ninja",
            "Pirate",
            "Shinigami",
            "God",
            1
        )

        questionList.add(questionThree)

        // Question 4
        val questionFour = Question(
            4,
            "Monkey D Luffy's Gear 5 is inspired from which God?",
            R.drawable.ic_question4,
            "Rain God",
            "Forest God",
            "Sun God",
            "Earth God",
            3
        )

        questionList.add(questionFour)

        // Question 5
        val questionFive = Question(
            5,
            "Who is the host of Sukuna in Jujutsu Kaisen manga/anime series?",
            R.drawable.ic_question5,
            "Saturo Gojo",
            "Kugisaki Nobara",
            "Megumi Fushigoro",
            "Itadori Yuuji",
            4
        )

        questionList.add(questionFive)

        return questionList
    }
}