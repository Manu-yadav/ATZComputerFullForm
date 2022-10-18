package com.androidtalk.atzcomputerfullform.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.adaptor.CustomExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewIntelligenceAgenciesActivity extends BaseActivity {

    private CustomExpandableListAdapter mExpandableListAdapter;
    private ExpandableListView mExpandableListView;
    private ArrayList<String> mExpandableTitleList;
    private HashMap<String, List<String>> mExpandableDetailMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_intelligence_agencies);
        initView();
        initVariables();
    }

    @Override
    void initView() {
        mExpandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
    }

    @Override
    void initVariables() {
        mExpandableDetailMap = getData();
        mExpandableTitleList = new ArrayList<String>(mExpandableDetailMap.keySet());
        mExpandableListAdapter = new CustomExpandableListAdapter(this, mExpandableTitleList, mExpandableDetailMap);
        mExpandableListView.setAdapter(mExpandableListAdapter);
    }

    private HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> afghanistan = new ArrayList<String>();
        afghanistan.add("General Directorate of Intelligence (GDI)");

        List<String> albania = new ArrayList<String>();
        albania.add("State Intelligence Service (SHISH)");

        List<String> argentina = new ArrayList<String>();
        argentina.add("Federal Intelligence Agency");

        List<String> armenia = new ArrayList<String>();
        armenia.add("Federal Intelligence Agency");

        List<String> australia = new ArrayList<String>();
        australia.add("Australian Security Intelligence Organisation (ASIO)");
        australia.add("Australian Secret Intelligence Service (ASIS)");
        australia.add("Australian Signals Directorate (ASD)");
        australia.add("Australian Geospatial-Intelligence Organisation (AGO)");
        australia.add("Defence Intelligence Organisation (DIO)");
        australia.add("Office of National Intelligence (ONI)");

        List<String> austria = new ArrayList<String>();
        austria.add("Bundesministerium für Landesverteidigung (BMLV):");
        austria.add("Bundesministerium für Inneres (BMI):");

        List<String> azerbaijan = new ArrayList<String>();
        azerbaijan.add("State Security Service");
        azerbaijan.add("Foreign Intelligence Service");
        azerbaijan.add("Financial Monitoring Service");

        List<String> bahamas = new ArrayList<String>();
        bahamas.add("Security and Intelligence Branch (SIB)");
        bahamas.add("Financial Intelligence Unit (FIU)");

        List<String> bahrain = new ArrayList<String>();
        bahrain.add("NSA – National Security Agency");

        List<String> bangladesh = new ArrayList<String>();
        bangladesh.add("National Committee for Intelligence Coordination");
        bangladesh.add("National Security Affairs Cell");

        List<String> barbados = new ArrayList<String>();
        barbados.add("Financial Intelligence Unit (FIU)");
        barbados.add("Criminal Investigations Department (CID)");

        List<String> belarus = new ArrayList<String>();
        belarus.add(" (KDB/KGB) State Security Committee");

        List<String> belgium = new ArrayList<String>();
        belgium.add("(VSSE) State Security Service");
        belgium.add("General Intelligence and Security Service, military intelligence");

        List<String> botswana = new ArrayList<String>();
        botswana.add("Directorate on Intelligence and Security Services");

        List<String> brazil = new ArrayList<String>();
        brazil.add("Brazilian Intelligence Agency (ABIN)");
        brazil.add("Federal Police Department (DPF)");
        brazil.add("Gabinete de Segurança Institucional");
        brazil.add("Secretaria da Receita Federal do Brasil");

        List<String> brunei = new ArrayList<String>();
        brunei.add("Internal Security Department");
        brunei.add("Research Department (external)");

        List<String> bulgaria = new ArrayList<String>();
        bulgaria.add("State Intelligence Agency");
        bulgaria.add("State Agency for National Security");

        List<String> burundi = new ArrayList<String>();
        burundi.add("Service national de renseignement (SNR)");

        List<String> canada = new ArrayList<String>();
        canada.add("Canadian Security Intelligence Service (CSIS)");
        canada.add("Communications Security Establishment (CSE)");
        canada.add("Canadian Forces Intelligence Command (DND)");
        canada.add("Criminal Intelligence Service Canada (CISC)");
        canada.add("Financial Transactions and Reports Analysis Centre of Canada (FINTRAC)");
        canada.add("Global Affairs Canada (GAC)");
        canada.add("Royal Canadian Mounted Police (RCMP)");
        canada.add("Canada Border Services Agency (CBSA)");

        List<String> chad = new ArrayList<String>();
        chad.add("Agence nationale de sécurité (ANS)");

        List<String> chile = new ArrayList<String>();
        chile.add("National Intelligence Agency (ANI)");

        List<String> china = new ArrayList<String>();
        china.add("610 Office");
        china.add("International Department (ID)");
        china.add("United Front Work Department (UFWD)");
        china.add("Joint Staff Department of the Central Military Commission");
        china.add("PLA Unit 61398 aka APT 1");

        List<String> colombia = new ArrayList<String>();
        colombia.add("Dirección Nacional de Inteligencia (DNI)");

        List<String> congo = new ArrayList<String>();
        congo.add("National Intelligence Agency (ANR)");
        congo.add("General Staff of Military intelligence");

        List<String> croatia = new ArrayList<String>();
        croatia.add("(SOA) Security and Intelligence Agency");
        croatia.add("(VSOA) Military Security and Intelligence Agency");

        List<String> cuba = new ArrayList<String>();
        cuba.add("Military Counterintelligence Directorate");
        cuba.add("Dirección General de Inteligencia (DGI)");

        List<String> cyprus = new ArrayList<String>();
        cyprus.add("Cyprus Intelligence Service (CIS)");

        List<String> Czech_Republic = new ArrayList<String>();
        Czech_Republic.add("Security Information Service");
        Czech_Republic.add("Office for Foreign Relations and Information");
        Czech_Republic.add("Military Intelligence");

        List<String> denmark = new ArrayList<String>();
        denmark.add("Danish Security and Intelligence Service");
        denmark.add("Danish Defence Intelligence Service");
        denmark.add("Army Intelligence Center");

        List<String> ecuador = new ArrayList<String>();
        ecuador.add("National Intelligence Secretariat");

        List<String> egypt = new ArrayList<String>();
        egypt.add("Gihaz al-Mukhabarat al-Amma (GIS)");
        egypt.add("Idarat al-Mukhabarat al-Harbyya wa al-Istitla");
        egypt.add("Al-amn al-Watani");

        List<String> eritrea = new ArrayList<String>();
        eritrea.add("National Security Office");

        List<String> estonia = new ArrayList<String>();
        estonia.add("Estonian Internal Security Service");
        estonia.add("Foreign Intelligence Service");

        List<String> ethiopia = new ArrayList<String>();
        ethiopia.add("Information Network Security Agency");
        ethiopia.add("National Intelligence and Security Service");

        List<String> finland = new ArrayList<String>();
        finland.add("Finnish Defence Intelligence Agency");
        finland.add("Intelligence Division (Finland)");
        finland.add("Finnish Security Intelligence Service");

        List<String> france = new ArrayList<String>();
        france.add("National Centre for Counter Terrorism");
        france.add("General Directorate for Internal Security");
        france.add("Directorate-General for External Security");
        france.add("Direction du Renseignement et de la Sécurité de la Défense");
        france.add("Directorate of Military Intelligence");

        List<String> gambia = new ArrayList<String>();
        gambia.add("State Intelligence Services");

        List<String> georgia = new ArrayList<String>();
        georgia.add("State Security Service (SSSG)");
        georgia.add("Georgian Intelligence Service (GIS)");
        georgia.add("Military Intelligence Department");

        List<String> germany = new ArrayList<String>();
        germany.add("Federal Intelligence Service (BND)");
        germany.add("Military Counterintelligence Service (MAD)");
        germany.add("Federal Office for the Protection of the Constitution");
        germany.add("State Offices for the Protection of the Constitution");

        List<String> ghana = new ArrayList<String>();
        ghana.add("Bureau of National Investigations (BNI)");

        List<String> greece = new ArrayList<String>();
        greece.add("National Intelligence Service");
        greece.add("E Division – Intelligence Division");

        List<String> haiti = new ArrayList<String>();
        haiti.add("Service d'Intelligence National (SIN)");

        List<String> hungary = new ArrayList<String>();
        hungary.add("Információs Hivatal (IH)");
        hungary.add("Alkotmányvédelmi Hivatal (AH)");
        hungary.add("Terrorelhárítási Központ (TEK)");

        List<String> iceland = new ArrayList<String>();
        iceland.add("National Security Agency");
        iceland.add("Military Intelligence Service");

        List<String> india = new ArrayList<String>();
        india.add("Research and Analysis Wing (RAW)");
        india.add("Directorate of Military Intelligence");
        india.add("Directorate of Air Intelligence");
        india.add("Directorate of Naval Intelligence");
        india.add("Joint Cipher Bureau");
        india.add("Intelligence Bureau (IB)");

        List<String> indonesia = new ArrayList<String>();
        indonesia.add("State Intelligence Agency");
        indonesia.add("Indonesian Army Intelligence Centre ");
        indonesia.add("National Cyber and Crypto Agency");
        indonesia.add("Geospatial Information Agency ");
        indonesia.add("Office of the Solicitor General for Intelligence");

        List<String> iran = new ArrayList<String>();
        iran.add("Ministry of Intelligence (VAJA)");
        iran.add("Oghab 2 ");
        iran.add("Council for Intelligence Coordination");
        iran.add("Intelligence Protection Organization of Iranian Army");


        List<String> iraq = new ArrayList<String>();
        iraq.add("General Security Directorate - (GSD)");
        iraq.add("Iraqi National Intelligence Service - (INIS)");
        iraq.add("Falcons Intelligence Cell - (FIC)");
        iraq.add("Kurdistan Region Security Council (KRSC)");


        List<String> ireland = new ArrayList<String>();
        ireland.add("Directorate of Military Intelligence (G2)");
        ireland.add("Communications and Information Services Corps");
        ireland.add("Special Detective Unit");
        ireland.add("National Surveillance Unit");


        List<String> israel = new ArrayList<String>();
        israel.add("Mossad (Foreign Intelligence and Special Operations)");
        israel.add("Shin Bet (Internal Security Service)");
        israel.add("Aman (Military intelligence)");
        israel.add("Lahav 433 (Police intelligence)");

        List<String> italy = new ArrayList<String>();
        italy.add("Agenzia Informazioni e Sicurezza Interna (AISI)");
        italy.add("Agenzia Informazioni e Sicurezza Esterna");
        italy.add("Centro Intelligence Interforze (CII)");

        List<String> japan = new ArrayList<String>();
        japan.add("Cabinet Intelligence and Research Office (CIRO)");
        japan.add("Defense Intelligence Headquarters (DIH)");
        japan.add("Public Security Intelligence Agency (PSIA)");

        List<String> jordan = new ArrayList<String>();
        jordan.add("General Intelligence Department (GID)");

        List<String> kenya = new ArrayList<String>();
        kenya.add("National Intelligence Service (NIS)");

        List<String> NorthKorea = new ArrayList<String>();
        NorthKorea.add("Reconnaissance General Bureau");
        NorthKorea.add("Ministry of State Security");

        List<String> southKorea = new ArrayList<String>();
        southKorea.add("National Intelligence Service (NIS)");
        southKorea.add("Defense Intelligence Agency (DIA)");
        southKorea.add("Defense Security Support Command (DSSC)");

        List<String> kyrgyzstan = new ArrayList<String>();
        kyrgyzstan.add("State Committee for National Security");

        List<String> lebanon = new ArrayList<String>();
        lebanon.add("General Directorate of General Security");
        lebanon.add("The Information Branch");
        lebanon.add("Lebanese State Security");

        expandableListDetail.put("Afghanistan", afghanistan);
        expandableListDetail.put("Albania", albania);
        expandableListDetail.put("Argentina", argentina);
        expandableListDetail.put("Armenia", armenia);
        expandableListDetail.put("Australia", australia);
        expandableListDetail.put("Austria", austria);
        expandableListDetail.put("Azerbaijan", azerbaijan);
        expandableListDetail.put("Bahamas", bahamas);
        expandableListDetail.put("Bahrain", bahrain);
        expandableListDetail.put("Bangladesh", bangladesh);
        expandableListDetail.put("Barbados", barbados);
        expandableListDetail.put("Belarus", belarus);
        expandableListDetail.put("Belgium", belgium);
        expandableListDetail.put("Botswana", botswana);
        expandableListDetail.put("Brazil", brazil);
        expandableListDetail.put("Brunei", brunei);
        expandableListDetail.put("Bulgaria", bulgaria);
        expandableListDetail.put("Burundi", burundi);
        expandableListDetail.put("Canada", canada);
        expandableListDetail.put("Chad", chad);
        expandableListDetail.put("Chile", chile);
        expandableListDetail.put("China", china);
        expandableListDetail.put("Colombia", colombia);
        expandableListDetail.put("Congo", congo);
        expandableListDetail.put("Croatia", croatia);
        expandableListDetail.put("Cuba", cuba);
        expandableListDetail.put("Cyprus", cyprus);
        expandableListDetail.put("Czech_Republic", Czech_Republic);
        expandableListDetail.put("Denmark", denmark);
        expandableListDetail.put("Ecuador", ecuador);
        expandableListDetail.put("Egypt", egypt);
        expandableListDetail.put("Eritrea", eritrea);
        expandableListDetail.put("Estonia", estonia);
        expandableListDetail.put("Ethiopia", ethiopia);
        expandableListDetail.put("Finland", finland);
        expandableListDetail.put("France", france);
        expandableListDetail.put("Gambia", gambia);
        expandableListDetail.put("Georgia", georgia);
        expandableListDetail.put("Germany", germany);
        expandableListDetail.put("Ghana", ghana);
        expandableListDetail.put("Greece", greece);
        expandableListDetail.put("Haiti", haiti);
        expandableListDetail.put("Hungary", hungary);
        expandableListDetail.put("Iceland", iceland);
        expandableListDetail.put("India", india);
        expandableListDetail.put("Indonesia", indonesia);
        expandableListDetail.put("Iran", iran);
        expandableListDetail.put("Iraq", iraq);
        expandableListDetail.put("Ireland", ireland);
        expandableListDetail.put("Israel", israel);
        expandableListDetail.put("Italy", italy);
        expandableListDetail.put("Japan", japan);
        expandableListDetail.put("Jordan", jordan);
        expandableListDetail.put("Kenya", kenya);
        expandableListDetail.put("North_Korea", NorthKorea);
        expandableListDetail.put("South_Korea", southKorea);
        expandableListDetail.put("Kyrgyzstan", kyrgyzstan);
        expandableListDetail.put("Lebanon", lebanon);
        return expandableListDetail;
    }
}