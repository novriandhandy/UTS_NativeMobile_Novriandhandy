package com.example.utsnativemobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val charreList = listOf<CharRe>(
            CharRe(
                R.drawable.chris,
                nameChar = "Chris Redfield",
                descChar = "Captain Chris Redfield (クリス・レッドフィールド Kurisu Reddofīrudo?) is an American operator in the Bioterrorism Security Assessment Alliance, " +
                        "in which he has served since its foundation in 2003. Redfield has built up and dedicated his career in destroying Bio Organic Weapons and fighting " +
                        "against producers and sellers of bioweapons after his experiences with bioterrorism in 1998. He is the older brother of TerraSave member Claire Redfield."
            ),

            CharRe(
                R.drawable.claire,
                nameChar = "Claire Redfield",
                descChar = "Claire Redfield (クレア・レッドフィールド Kurea Reddofīrudo?) is a current member of the human rights organization, TerraSave. She is the younger sister of " +
                        "BSAA operative and former S.T.A.R.S. member Chris Redfield. Since her survival in the Raccoon City incident in 1998, Claire would become involved or end up in " +
                        "the midst of several Biohazard outbreaks around the world, prompting her, as well as Chris, to devote her career to combating the threat of Bio Organic Weapons."
            ),

            CharRe(
                R.drawable.jill,
                nameChar = "Jill Valentine",
                descChar = "Jill Valentine (ジル・バレンタイン Jiru Barentain?) is an American Special Operations Agent (SOA) of the Bioterrorism Security Assessment Alliance, " +
                        "of which she is a co-founder and an original member. She is a respected high-ranking operator, owing to her commitment in eradicating bioterrorism and her " +
                        "survival amid to the Biohazardous outbreaks in Arklay County in 1998."
            ),

            CharRe(
                R.drawable.leon,
                nameChar = "Leon S.Kennedy",
                descChar = "Leon Scott Kennedy is an American of Italian descent currently employed as a federal agent by the Division of Security Operations (D.S.O.), a counter-terrorism " +
                        "agency with direct Presidential oversight. Kennedy is a known survivor of the 1998 Raccoon City Destruction Incident, then as a police officer. Following his escape, " +
                        "he was offered a job in a US.STRATCOM team devoted to anti-B.O.W. combat, and served it until 2011 in repeated operations around the world."
            ),

            CharRe(
                R.drawable.ada,
                nameChar = "Ada Wong",
                descChar = "Ada Wong (エイダ・ウォン Eida Won?) is the pseudonym of an enigmatic unnamed spy of Asian-American descent. She has gained notoriety in the corporate world for being able to " +
                        "handle serious situations and the most difficult requests without guilt. She acted secretly in the background of many biohazard incidents and collected information which became " +
                        "useful to several organisations, while at the same time operating to undermine them."
            ),

            CharRe(
                R.drawable.wesker,
                nameChar = "Albert Wesker",
                descChar = "Originally one of the test subjects in Project W who specialised in biotechnology and bioengineering, Wesker was an elite perfectionist individual of absolute coldness, " +
                        "always wearing deep-black sunglasses that gave him an even more unapproachable air. As a senior researcher linked to the t-Virus Project as early as 1978, he bore witness to and " +
                        "at times shaped Umbrella's B.O.W. research."
            ),

            CharRe(
                R.drawable.sherry,
                nameChar = "Sherry Birkin",
                descChar = "Sherry Birkin (シェリー・バーキン Sherī Bākin?) is an American federal agent attached to the Division of Security Operations. As a child, she was placed in protective custody after her " +
                        "parents' deaths during the Raccoon City Destruction Incident. During the outbreak, Sherry was infected with the G-Virus, but was treated with the vaccine soon after. Because of her exposure " +
                        "to the virus, Sherry gained lifelong regenerative abilities."
            ),

            CharRe(
                R.drawable.helena,
                nameChar = "Helena Harper",
                descChar = "Helena Harper (ヘレナ・ハーパー Herena Hāpā?) is an agent of the United States Secret Service (USSS),[2] a federal law enforcement agency under the Department of Homeland Security, and a former CIA agent. " +
                        "She had a younger sister named Deborah."
            ),

            CharRe(
                R.drawable.rose,
                nameChar = "Rosemary Winters",
                descChar = "Rosemary \"Rose\" Winters (ローズマリー・ウィンターズ Rōzumarī Wintāzu?) is an American superhuman. The daughter of mutants Ethan and Mia Winters, Winters' body was comprised entirely of Mold, which was " +
                        "replicating human DNA. Following her rescue from an outbreak in Eastern Europe, Rose grew up in the United States under special protection."
            ),

            CharRe(
                R.drawable.carla,
                nameChar = "Carla Radames",
                descChar = "Carla Radames was a genius researcher working for Derek C. Simmons, and the one responsible for the discovery and creation of the C-Virus. Due to deception by Simmons, she became a doppelganger of " +
                        "Ada Wong and the eventual founder of Neo-Umbrella."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_char_re)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CharAdapter(this, charreList){
            val intent = Intent (this, DetailCharActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}