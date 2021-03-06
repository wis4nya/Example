package com.example.example;

import android.content.SharedPreferences;

import java.util.Random;

public class TasksRus {
   public static String mType1Text = "В одном или нескольких из приведённых ниже слов допущена ошибка в постановке ударения. Выберите те слова, в которых ударение расставлено ПРАВИЛЬНО. (Возможно, что все варианты являются правильными)";
   public static String[] mType1Correct = {"бАнты", "тОрты", "шАрфы", "пОрты","срЕдства", "Иксы", "крАны", "кОнусы", "кОнусов", "лЕкторы", "лЕкторов", "пОручни", "мЕстностей", "пОчестей", "чЕлюстей", "анАлог", "бухгАлтеров", "граждАнство", "досУг", "недУг", "корЫсть", "кремЕнь", "лыжнЯ", "намЕрение", "нарОст", "придАное", "сирОты", "тамОжня", "цепОчка", "вероисповЕдание", "новостЕй", "еретИк", "кУхонный", "слИвовый", "знАчимый", "оптОвый", "прожОрлива", "мозаИчный", "чЕрпать", "щЁлкать", "клЕить", "прИбыл", "прИбыло", "прИнял", "прИняли", "зАнял", "зАняло", "зАняли", "клАла", "послАла", "крАлась", "укрАла", "опОшлить", "озлОбить", "оклЕить", "освЕдомиться", "откУпорить", "закУпорить", "принУдить", "дозИровать", "жилОсь", "исчЕрпать", "дозвонЯтся", "зАсветло", "зАтемно", "зАгодя", "завИдно", "дОверху", "дОнизу", "дОсуха", "донЕльзя", "вОвремя"};
   public static String[] mType1Incorrect = {"бантЫ", "тортЫ", "шарфЫ", "портЫ", "средствА", "иксЫ", "кранЫ", "конусЫ", "конУсов", "лектОры", "лектОров", "порУчни", "местнОстей", "почестЕй", "челюстЕй", "аналОг", "бухгалтерОв", "грАжданство", "дОсуг", "нЕдуг", "кОрысть", "крЕмень", "лЫжня", "намерЕние", "нАрост", "прИданое", "сИроты", "тАможня", "цЕпочка", "вероисповедАние", "нОвостей", "ерЕтик", "кухОнный", "сливОвый", "значИмый", "Оптовый", "прожорлИва", "мозАичный", "черпАть", "щелкАть", "клеИть", "прибЫл", "прибЫло", "принЯл", "принЯли", "занЯл", "занЯло", "занЯли", "клалА", "послалА", "кралАсь", "укралА", "опошлИть", "озлобИть", "оклеИть", "осведомИться", "откупОрить", "закупОрить", "принудИть", "дозировАть", "жИлось", "исчерпАть", "дозвОнятся", "засветлО", "затемнО", "загодЯ", "зАвидно", "довЕрху", "донИзу", "досухА", "дОнельзя", "воврЕмя"};

   public static void chose_vars(String[] correct, String[] incorrect, String[] answers, int[] keys){
      Random random = new Random();
      int am = 0;
      for (int i=0; i<4; i++){
         int corr_incorr = random.nextInt(100);
         if (corr_incorr%2==0){
            answers[i] = incorrect[random.nextInt(incorrect.length)];
            keys[i] = 0;
         } else{
            answers[i] = correct[random.nextInt(correct.length)];
            keys[i] = 1;
         }
      }
   }

}

