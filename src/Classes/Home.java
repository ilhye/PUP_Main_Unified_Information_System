package Classes;
import java.awt.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    
    // Constructor
    public Home() {
        initComponents();
        
        // App icon
        Image icon = new ImageIcon(getClass().getResource("/icons/image-300x300.jpg")).getImage();
        this.setIconImage(icon);
        
        JTabbedNavigation.setSelectedIndex(0); // to show the page of Home
    }
    
    private void ContentAchievements(){
        jTxtHolder1.setText("• Top school of choice of many companies in the country (2016, JobStreet.com Philippines)\n" +
        "\n• PUP is 9th most popular university in the Philippines based on the popularity of its website (2016, http://www.4icu.org/ph/)\n" +
        "\n• QS World University Rankings by Subject 2013 (Country File on the Philippines): Rank 3 in Life Science and Medicine, Rank 5 in Natural Science (Chemistry), Rank 4 in Economics and Econometrics, Rank 5 in Communication and Media Studies\n" +
        "\n• Commission on Higher Education (CHED) Center of Development for Excellence in Journalism and Filipino (2013)\n" +
        "\n• Accrediting Agency of Chartered Colleges and Universities in the Philippines (AACCUP): 58 programs of PUP are in the list of accreditation (4 Level III accredited programs, 15 qualified for Level III accreditation with 9 programs undergoing assessment, 14 Level II accredited programs, 11 Level I accredited programs, and 5 programs in the list as candidate for accreditation, as of 2012)\n" +
        "\n• President of the Philippines Proclamation No. 1992 and National Historical Institute's Board Resolution No. 01, s. 2008: Declaration of the PUP Mabini Campus as the permanent home of the Mabini Shrine.\n" +
        "\n• President of the Philippines Proclamation No. 482: Declaring the period of October 1, 2003 to October 31, 2004 as the Centenary of the Polytechnic University of the Philippines.\n" +
        "\n• Guinness Book of World Records: World's Largest Human Rainbow (2004)");
        jTxtHolder1.setCaretPosition(0);
    }
    
    private void ContentAdmission(){
        jTxtHolder4.setText("• Admission Details:\n" +
        "1. Baccalaureate Degree (4 or 5 years): Requires PUPCET and application through PUP iApply.\n" +
        "2. Diploma Program (3 years) leading to Baccalaureate Degree: Same application process as Baccalaureate Degree.\n" +
        "\n" +
        "• Eligibility for PUPCET:\n" +
        "1. Grade 12 student graduating in AY 2023-2024 with GWA ≥ 82%.\n" +
        "2. Passer of PEPT/ALS or NFEA & E-Program.\n" +
        "\n" +
        "• Application Process:\n" +
        "1. Go to PUP iApply (https://www.pup.edu.ph/iapply/pupcet).\n" +
        "2. Click Apply Now.\n" +
        "3. Create an account.\n" +
        "4. Answer prequalification questions.\n" +
        "5. Fill up the registration form.\n" +
        "6. Submit and sign in again.\n" +
        "7. Choose from options:\n" +
        "8. Application Form: Complete and finalize your application.\n" +
        "9. Finalize Application: Submit your application for evaluation.\n" +
        "10. Print ePermit: Download and print your exam permit (after approval).\n" +
        "11. Check PUPCET Results: Check after official release.\n" +
        "12. Sign out: Secure your account.\n" +
        "13. Review guidelines for online application photo.\n" +
        "14. Read FAQs about who can take PUPCET and where to apply.\n" +
        "\n" +
        "• Additional Information:\n" +
        "1. Apply for PUPCET only in one branch/campus and once per academic year.\n" +
        "2. Download ePermit 6-20 working days after application.\n" +
        "3. Use Chrome, Firefox, or Edge for PUP iApply.");
        jTxtHolder4.setLineWrap(true);
        jTxtHolder4.setCaretPosition(0);
    }
         
    private void ContentAdmissionSHS(){
        jTxtHolder4.setText(">> Required Documents for Online Registration <<\n" +
        "\n" +
        "1. Scanned photo of the applicant (JPEG file, 2x2 inches, recent, white background, name tag at chest)\n" +
        "2. Scanned Grade 9 Report Card/F137 (JPEG file)\n" +
        "3. Scanned Grade 10 Report Card (JPEG file, 1st and 2nd grading periods)\n" +
        "4. ESC/QVR Certificate (for students from private schools, currently enrolled in Grade 10 for SY 2022-2023)\n" +
        "\n" +
        ">> Important Reminders <<\n" +
        "• Report cards must clearly show:\n" +
        "     oComplete name\n" +
        "     oLRN\n" +
        "     oGrades in English, Math, and Science\n" +
        "• JPEG file size limit: 300 KB\n" +
        "• Use an active and correct email address.\n" +
        "• Finalized applications cannot be edited.\n" +
        "\n" +
        ">> Grounds for Invalid Registration <<\n" +
        "1.Multiple accounts/applications\n" +
        "2.Incorrect personal information or grades\n" +
        "3.Failure to upload required documents properly\n" +
        "\n" +
        ">> Grade Requirements <<\n" +
        "• English, Math, and Science: 85% and above\n" +
        "• Other subjects: No grade below 82%\n" +
        "     Admission is subject to slot availability.\n" +
        "\n" +
        ">> Tracks and Strands Offered <<\n" +
        "• Academic Track:\n" +
        "1.STEM (Science, Technology, Engineering, and Mathematics)\n" +
        "2.ABM (Accountancy, Business, and Management)\n" +
        "3.HUMSS (Humanities and Social Sciences)\n" +
        "\n" +
        "• Technical, Vocational, and Livelihood Track:\n" +
        "1. ICT (Information Communications Technology)\n" +
        "\n" +
        "• Inquiries:\n" +
        "Office of the Senior High School Admission Telephone Number: 53351787 loc. 356");
        jTxtHolder4.setCaretPosition(0);
    }

    private void ContentAdmissionScholarship(){
        jTxtHolder4.setText("PUP Scholarship and Financial Assistance (SFAS) Information:\n" +
        "------------------------------------------------------------------------------------------------------------------------\n" +
        "\n" +
        ">> Types of Support <<\n" +
        "1. Scholarships:\n" +
        "     o Entrance scholarships\n" +
        "     o Resident scholarships\n" +
        "     o Special grants\n" +
        "2. Financial Assistance:\n" +
        "     o Service grant-in-aid\n" +
        "     o Student loan\n" +
        "     o Work-study plan/Student assistantship\n" +
        "\n" +
        ">> Benefits <<\n" +
        "• Incentive equivalent to total assessed fees, either full or partial.\n" +
        "\n" +
        "• Source: Scholarship and Financial Assistance Services (SFAS), PUP Student Handbook, Rev. 2019\n" +
        "• Note: Information is from 2019. For updated details, please contact SFAS directly.\n" +
        "• Facebook Link: https://www.facebook.com/PUPSFAS");
        jTxtHolder4.setCaretPosition(0);
    }

    // Initialize form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        JTabbedNavigation = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelHMV = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jBtnHistory = new javax.swing.JButton();
        jBtnMission = new javax.swing.JButton();
        jBtnVision = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTxtHolder = new javax.swing.JTextArea();
        jLabel65 = new javax.swing.JLabel();
        jPanelAchievement = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtHolder1 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jPanelFacilities = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFacility_PicHostel = new javax.swing.JLabel();
        jFacility_PicMateo = new javax.swing.JLabel();
        jFacility_PicOlonan = new javax.swing.JLabel();
        jFacility_PicFootball = new javax.swing.JLabel();
        jFacility_PicInterfaith = new javax.swing.JLabel();
        jFacility_PicMedical = new javax.swing.JLabel();
        jFacility_PicNinoyLibrary = new javax.swing.JLabel();
        jFacility_PicSwimmingPool = new javax.swing.JLabel();
        jFacility_PicOutdoorGym = new javax.swing.JLabel();
        jFacility_PicLagoon = new javax.swing.JLabel();
        jFacility_PicBalagtas = new javax.swing.JLabel();
        jFacility_PicBookstore = new javax.swing.JLabel();
        jFacility_PicCanteen = new javax.swing.JLabel();
        jFacility_PicGym = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTxtHolder2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTxtHolder3 = new javax.swing.JTextArea();
        jLabel137 = new javax.swing.JLabel();
        jPanelAdmission = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTxtHolder4 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jBtnCollege = new javax.swing.JButton();
        jBtnSHS = new javax.swing.JButton();
        jBtnScholarship = new javax.swing.JButton();
        jLabel138 = new javax.swing.JLabel();
        jPanelColleges = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jCaf = new javax.swing.JLabel();
        jCadbe = new javax.swing.JLabel();
        jCal = new javax.swing.JLabel();
        jCba = new javax.swing.JLabel();
        jCoc = new javax.swing.JLabel();
        jCcis = new javax.swing.JLabel();
        jCoed = new javax.swing.JLabel();
        jCe = new javax.swing.JLabel();
        jChk = new javax.swing.JLabel();
        jCpspa = new javax.swing.JLabel();
        jCssd = new javax.swing.JLabel();
        jCs = new javax.swing.JLabel();
        jCthtm = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextLocation = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jLabel139 = new javax.swing.JLabel();
        jPanelClubs = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanelSTEvaluation = new javax.swing.JPanel();
        jRBYes1 = new javax.swing.JRadioButton();
        jRBNo1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRBYes2 = new javax.swing.JRadioButton();
        jRBNo2 = new javax.swing.JRadioButton();
        jRBYes3 = new javax.swing.JRadioButton();
        jRBYes4 = new javax.swing.JRadioButton();
        jRBNo4 = new javax.swing.JRadioButton();
        jRBYes5 = new javax.swing.JRadioButton();
        jRBNo5 = new javax.swing.JRadioButton();
        jRBYes6 = new javax.swing.JRadioButton();
        jRBNo6 = new javax.swing.JRadioButton();
        jRBYes7 = new javax.swing.JRadioButton();
        jRBNo7 = new javax.swing.JRadioButton();
        jRBYes8 = new javax.swing.JRadioButton();
        jRBNo8 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFMath = new javax.swing.JTextField();
        jTFFilipino = new javax.swing.JTextField();
        jTFEnglish = new javax.swing.JTextField();
        jTFArts = new javax.swing.JTextField();
        jTFScience = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jCBNcae = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jTFGenAve = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTFAcademic = new javax.swing.JTextField();
        jTFSports = new javax.swing.JTextField();
        jTFTVL = new javax.swing.JTextField();
        jLabelNextArrow = new javax.swing.JLabel();
        jCBAcadRating = new javax.swing.JCheckBox();
        jLabel72 = new javax.swing.JLabel();
        jRBNo3 = new javax.swing.JRadioButton();
        jPanelSTEvaluation_1 = new javax.swing.JPanel();
        jLabelBackArrow1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jRB1_3 = new javax.swing.JRadioButton();
        jRB1_1 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jRB1_2 = new javax.swing.JRadioButton();
        jRB2_1 = new javax.swing.JRadioButton();
        jRB2_2 = new javax.swing.JRadioButton();
        jRB2_3 = new javax.swing.JRadioButton();
        jRB3_1 = new javax.swing.JRadioButton();
        jRB3_2 = new javax.swing.JRadioButton();
        jRB3_3 = new javax.swing.JRadioButton();
        jRB4_1 = new javax.swing.JRadioButton();
        jRB4_2 = new javax.swing.JRadioButton();
        jRB4_3 = new javax.swing.JRadioButton();
        jRB5_1 = new javax.swing.JRadioButton();
        jRB5_2 = new javax.swing.JRadioButton();
        jRB5_3 = new javax.swing.JRadioButton();
        jRB6_1 = new javax.swing.JRadioButton();
        jRB6_2 = new javax.swing.JRadioButton();
        jRB6_3 = new javax.swing.JRadioButton();
        jRB7_1 = new javax.swing.JRadioButton();
        jRB7_2 = new javax.swing.JRadioButton();
        jRB7_3 = new javax.swing.JRadioButton();
        jRB8_1 = new javax.swing.JRadioButton();
        jRB8_2 = new javax.swing.JRadioButton();
        jRB8_3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelNextArrow1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelSTEvaluation_2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabelNextArrow3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jRB9_3 = new javax.swing.JRadioButton();
        jRB9_1 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jRB9_2 = new javax.swing.JRadioButton();
        jRB10_1 = new javax.swing.JRadioButton();
        jRB10_2 = new javax.swing.JRadioButton();
        jRB10_3 = new javax.swing.JRadioButton();
        jRB11_1 = new javax.swing.JRadioButton();
        jRB11_2 = new javax.swing.JRadioButton();
        jRB11_3 = new javax.swing.JRadioButton();
        jRB12_1 = new javax.swing.JRadioButton();
        jRB12_2 = new javax.swing.JRadioButton();
        jRB12_3 = new javax.swing.JRadioButton();
        jRB13_1 = new javax.swing.JRadioButton();
        jRB13_2 = new javax.swing.JRadioButton();
        jRB13_3 = new javax.swing.JRadioButton();
        jRB14_1 = new javax.swing.JRadioButton();
        jRB14_2 = new javax.swing.JRadioButton();
        jRB14_3 = new javax.swing.JRadioButton();
        jRB15_1 = new javax.swing.JRadioButton();
        jRB15_2 = new javax.swing.JRadioButton();
        jRB15_3 = new javax.swing.JRadioButton();
        jRB16_1 = new javax.swing.JRadioButton();
        jRB16_2 = new javax.swing.JRadioButton();
        jRB16_3 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelNextArrow4 = new javax.swing.JLabel();
        jPanelSTEvaluation_4 = new javax.swing.JPanel();
        jLabelResultTrack2 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabelHUMMS = new javax.swing.JLabel();
        jLabelSTEM = new javax.swing.JLabel();
        jLabelABM = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabelPERFORMING_ARTS22 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabelPERFORMING_ARTS = new javax.swing.JLabel();
        jLabelFILM_PRODUCTION = new javax.swing.JLabel();
        jLabelANIMATION = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabelSPORTS_OFFICIATING = new javax.swing.JLabel();
        jLabelSPORTS_COACHING = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabelHOME_ECONOMICS = new javax.swing.JLabel();
        jLabelICT = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabelINDUSTRIAL_ARTS = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabelResultStrand = new javax.swing.JLabel();
        jLabelResultSportsTrack = new javax.swing.JLabel();
        jLabelResultAcadTrack = new javax.swing.JLabel();
        jLabelResultArtsTrack = new javax.swing.JLabel();
        jLabelResultTVLTrack = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanelFunFacts = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jPanelSTEvaluation_3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabelNextArrow5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jRB17_3 = new javax.swing.JRadioButton();
        jRB17_1 = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jRB17_2 = new javax.swing.JRadioButton();
        jRB18_1 = new javax.swing.JRadioButton();
        jRB18_2 = new javax.swing.JRadioButton();
        jRB18_3 = new javax.swing.JRadioButton();
        jRB19_1 = new javax.swing.JRadioButton();
        jRB19_2 = new javax.swing.JRadioButton();
        jRB19_3 = new javax.swing.JRadioButton();
        jRB20_1 = new javax.swing.JRadioButton();
        jRB20_2 = new javax.swing.JRadioButton();
        jRB20_3 = new javax.swing.JRadioButton();
        jRB21_1 = new javax.swing.JRadioButton();
        jRB21_2 = new javax.swing.JRadioButton();
        jRB21_3 = new javax.swing.JRadioButton();
        jRB22_1 = new javax.swing.JRadioButton();
        jRB22_2 = new javax.swing.JRadioButton();
        jRB22_3 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jButtonRessults = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("←");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(136, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 994, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jPanel2.setBackground(new java.awt.Color(136, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1080, 90));
        jPanel2.setMinimumSize(new java.awt.Dimension(1080, 90));
        jPanel2.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POLYTECHIC UNIVERSITY OF THE PHILIPPINES");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-50x50.jpg"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THE COUNTRY'S FIRST POLYTECHNIC");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(136, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOME", "HISTORY, MISSION, and VISION", "ACHIEVEMENTS", "FACILITIES", "ADMISSION/SCHOLARSHIP", "COLLEGES", "DEPARTMENT CLUBS", "STRAND AND TRACK EVALUATION", "PUP FUN FACTS" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.setPreferredSize(new java.awt.Dimension(176, 32));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 90));

        JTabbedNavigation.setMaximumSize(new java.awt.Dimension(1080, 482));
        JTabbedNavigation.setMinimumSize(new java.awt.Dimension(1080, 482));
        JTabbedNavigation.setPreferredSize(new java.awt.Dimension(1080, 482));

        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setBackground(new java.awt.Color(254, 222, 8));
        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(136, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("\"MULA SA 'YO, PARA SA BAYAN\"");
        jPanelHome.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 400, 100));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/facebook-50.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanelHome.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, 60));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linkedin-50.png"))); // NOI18N
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanelHome.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, 60));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-youtube-50.png"))); // NOI18N
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        jPanelHome.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 50, 60));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-twitter-50.png"))); // NOI18N
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        jPanelHome.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, -1, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homeBg-1080x480.jpg"))); // NOI18N
        jPanelHome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        JTabbedNavigation.addTab("tab1", jPanelHome);

        jPanelHMV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(319, 470));
        jPanel9.setMinimumSize(new java.awt.Dimension(319, 470));
        jPanel9.setPreferredSize(new java.awt.Dimension(319, 470));

        jBtnHistory.setBackground(new java.awt.Color(255, 255, 255));
        jBtnHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnHistory.setForeground(new java.awt.Color(136, 0, 0));
        jBtnHistory.setText("HISTORY");
        jBtnHistory.setToolTipText("");
        jBtnHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnHistory.setFocusable(false);
        jBtnHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnHistoryMouseClicked(evt);
            }
        });
        jBtnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHistoryActionPerformed(evt);
            }
        });

        jBtnMission.setBackground(new java.awt.Color(255, 255, 255));
        jBtnMission.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnMission.setForeground(new java.awt.Color(136, 0, 0));
        jBtnMission.setText("MISSION");
        jBtnMission.setToolTipText("");
        jBtnMission.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnMission.setFocusable(false);
        jBtnMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnMissionMouseClicked(evt);
            }
        });
        jBtnMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMissionActionPerformed(evt);
            }
        });

        jBtnVision.setBackground(new java.awt.Color(255, 255, 255));
        jBtnVision.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnVision.setForeground(new java.awt.Color(136, 0, 0));
        jBtnVision.setText("VISION");
        jBtnVision.setToolTipText("");
        jBtnVision.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnVision.setFocusable(false);
        jBtnVision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnVisionMouseClicked(evt);
            }
        });
        jBtnVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVision, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMission, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jBtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jBtnMission, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jBtnVision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanelHMV.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        jTxtHolder.setEditable(false);
        jTxtHolder.setColumns(20);
        jTxtHolder.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTxtHolder.setLineWrap(true);
        jTxtHolder.setRows(1);
        jTxtHolder.setToolTipText("");
        jTxtHolder.setWrapStyleWord(true);
        jTxtHolder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 5, true));
        jTxtHolder.setDragEnabled(true);
        jTxtHolder.setFocusable(false);
        jTxtHolder.setMaximumSize(new java.awt.Dimension(650, 360));
        jTxtHolder.setMinimumSize(new java.awt.Dimension(650, 360));
        jTxtHolder.setPreferredSize(new java.awt.Dimension(650, 360));
        jScrollPane6.setViewportView(jTxtHolder);

        jPanelHMV.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 650, 390));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design.png"))); // NOI18N
        jPanelHMV.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        JTabbedNavigation.addTab("tab2", jPanelHMV);

        jPanelAchievement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtHolder1.setEditable(false);
        jTxtHolder1.setColumns(20);
        jTxtHolder1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTxtHolder1.setLineWrap(true);
        jTxtHolder1.setRows(1);
        jTxtHolder1.setToolTipText("");
        jTxtHolder1.setWrapStyleWord(true);
        jTxtHolder1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 5, true));
        jTxtHolder1.setDragEnabled(true);
        jTxtHolder1.setFocusable(false);
        jTxtHolder1.setMaximumSize(new java.awt.Dimension(650, 360));
        jTxtHolder1.setMinimumSize(new java.awt.Dimension(650, 360));
        jTxtHolder1.setPreferredSize(new java.awt.Dimension(650, 360));
        jScrollPane2.setViewportView(jTxtHolder1);

        jPanelAchievement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 650, 390));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(319, 470));
        jPanel14.setMinimumSize(new java.awt.Dimension(319, 470));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("AWARDS &");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("RECOGNITION");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel67)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanelAchievement.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design.png"))); // NOI18N
        jPanelAchievement.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        JTabbedNavigation.addTab("tab2", jPanelAchievement);

        jPanelFacilities.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jList1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. 7-FLOOR HOSTEL", "2. DR. MATEO CONFERENCE ROOM", "3. DR. OLONAN AND DR. CARAGUE CONFERENCE ROOM", "4. FOOTBALL FIELD", "5. INTERFAITH CHAPEL", "6. MEDICAL AND DENTAL EQUIPMENT", "7. NINOY AQUINO LIBRARY AND LEARNING RESOURCES CENTER", "8. OLYMPIC SIZED SWIMMING POOL", "9. OUTDOOR GYM", "10. PUP-LAGOON", "11. THE BALAGTAS HALL (BULWAGANG BALAGTAS)", "12. UNIVERSITY BOOKSTORE", "13. UNIVERSITY CANTEEN", "14. UNIVERSITY GYMNASIUM" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jPanelFacilities.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 330));

        jFacility_PicHostel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hostel.jpg"))); // NOI18N
        jFacility_PicHostel.setText("jLabel66");
        jFacility_PicHostel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicHostel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicMateo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mateo.jpg"))); // NOI18N
        jFacility_PicMateo.setText("jLabel66");
        jFacility_PicMateo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicMateo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicOlonan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/olona.jpg"))); // NOI18N
        jFacility_PicOlonan.setText("jLabel66");
        jFacility_PicOlonan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicOlonan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicFootball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/football.jpg"))); // NOI18N
        jFacility_PicFootball.setText("jLabel66");
        jFacility_PicFootball.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicFootball, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicInterfaith.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/interfaith.jpg"))); // NOI18N
        jFacility_PicInterfaith.setText("jLabel66");
        jFacility_PicInterfaith.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicInterfaith, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicMedical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/medical.jpg"))); // NOI18N
        jFacility_PicMedical.setText("jLabel66");
        jFacility_PicMedical.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicMedical, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicNinoyLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ninoy library.jpg"))); // NOI18N
        jFacility_PicNinoyLibrary.setText("jLabel66");
        jFacility_PicNinoyLibrary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicNinoyLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicSwimmingPool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/olympic swimming pool.jpg"))); // NOI18N
        jFacility_PicSwimmingPool.setText("jLabel66");
        jFacility_PicSwimmingPool.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicSwimmingPool, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicOutdoorGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/outdoor gym.jpg"))); // NOI18N
        jFacility_PicOutdoorGym.setText("jLabel66");
        jFacility_PicOutdoorGym.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicOutdoorGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicLagoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pup-lagoon.jpg"))); // NOI18N
        jFacility_PicLagoon.setText("jLabel66");
        jFacility_PicLagoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicLagoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicBalagtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/balagtas.jpg"))); // NOI18N
        jFacility_PicBalagtas.setText("jLabel66");
        jFacility_PicBalagtas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicBalagtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicBookstore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookstore.jpg"))); // NOI18N
        jFacility_PicBookstore.setText("jLabel66");
        jFacility_PicBookstore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicBookstore, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicCanteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/canteen.jpg"))); // NOI18N
        jFacility_PicCanteen.setText("jLabel66");
        jFacility_PicCanteen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicCanteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jFacility_PicGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gym.jpg"))); // NOI18N
        jFacility_PicGym.setText("jLabel66");
        jFacility_PicGym.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 10, true));
        jPanelFacilities.add(jFacility_PicGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 471, 330));

        jTxtHolder2.setEditable(false);
        jTxtHolder2.setColumns(20);
        jTxtHolder2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTxtHolder2.setLineWrap(true);
        jTxtHolder2.setRows(1);
        jTxtHolder2.setToolTipText("");
        jTxtHolder2.setWrapStyleWord(true);
        jTxtHolder2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 3, true));
        jTxtHolder2.setDragEnabled(true);
        jTxtHolder2.setFocusable(false);
        jScrollPane4.setViewportView(jTxtHolder2);

        jPanelFacilities.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 470, 110));

        jTxtHolder3.setEditable(false);
        jTxtHolder3.setColumns(20);
        jTxtHolder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTxtHolder3.setLineWrap(true);
        jTxtHolder3.setRows(1);
        jTxtHolder3.setToolTipText("");
        jTxtHolder3.setWrapStyleWord(true);
        jTxtHolder3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jTxtHolder3.setDragEnabled(true);
        jTxtHolder3.setFocusable(false);
        jScrollPane5.setViewportView(jTxtHolder3);

        jPanelFacilities.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 540, 110));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design.png"))); // NOI18N
        jPanelFacilities.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        JTabbedNavigation.addTab("tab2", jPanelFacilities);

        jPanelAdmission.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtHolder4.setEditable(false);
        jTxtHolder4.setBackground(new java.awt.Color(255, 224, 224));
        jTxtHolder4.setColumns(20);
        jTxtHolder4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTxtHolder4.setLineWrap(true);
        jTxtHolder4.setRows(1);
        jTxtHolder4.setToolTipText("");
        jTxtHolder4.setWrapStyleWord(true);
        jTxtHolder4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 5, true));
        jTxtHolder4.setDragEnabled(true);
        jTxtHolder4.setFocusable(false);
        jScrollPane7.setViewportView(jTxtHolder4);

        jPanelAdmission.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 640, 380));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(319, 470));
        jPanel15.setMinimumSize(new java.awt.Dimension(319, 470));

        jBtnCollege.setBackground(new java.awt.Color(255, 255, 255));
        jBtnCollege.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnCollege.setForeground(new java.awt.Color(136, 0, 0));
        jBtnCollege.setText("COLLEGE");
        jBtnCollege.setToolTipText("");
        jBtnCollege.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnCollege.setFocusable(false);
        jBtnCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCollegeMouseClicked(evt);
            }
        });
        jBtnCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCollegeActionPerformed(evt);
            }
        });

        jBtnSHS.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSHS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnSHS.setForeground(new java.awt.Color(136, 0, 0));
        jBtnSHS.setText("SENIOR HIGH SCHOOL");
        jBtnSHS.setToolTipText("");
        jBtnSHS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnSHS.setFocusable(false);
        jBtnSHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSHSMouseClicked(evt);
            }
        });
        jBtnSHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSHSActionPerformed(evt);
            }
        });

        jBtnScholarship.setBackground(new java.awt.Color(255, 255, 255));
        jBtnScholarship.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnScholarship.setForeground(new java.awt.Color(136, 0, 0));
        jBtnScholarship.setText("SCHOLARSHIP");
        jBtnScholarship.setToolTipText("");
        jBtnScholarship.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jBtnScholarship.setFocusable(false);
        jBtnScholarship.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnScholarshipMouseClicked(evt);
            }
        });
        jBtnScholarship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnScholarshipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBtnSHS, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jBtnScholarship, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCollege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jBtnCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jBtnSHS, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jBtnScholarship, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanelAdmission.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design.png"))); // NOI18N
        jPanelAdmission.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        JTabbedNavigation.addTab("tab2", jPanelAdmission);

        jPanelColleges.setMaximumSize(new java.awt.Dimension(1080, 480));
        jPanelColleges.setMinimumSize(new java.awt.Dimension(1080, 480));
        jPanelColleges.setPreferredSize(new java.awt.Dimension(1080, 480));
        jPanelColleges.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(319, 470));
        jPanel17.setMinimumSize(new java.awt.Dimension(319, 470));

        jList2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "College of Accountancy and Finance (CAF)", "College of Architecture, Design and the Built Environment (CADBE, formerly the College of Architecture and Fine Arts)", "College of Arts and Letters (CAL)", "College of Business Administration (CBA)", "College of Communication (COC)", "College of Computer and Information Sciences (CCIS)", "College of Education (COED)", "College of Engineering (CE)", "College of Human Kinetics (CHK)", "College of Law (CL)", "College of Political Science and Public Administration (CPSPA)", "College of Social Sciences and Development (CSSD)", "College of Science (CS)", "College of Tourism, Hospitality and Transportation Management (CTHTM)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jPanelColleges.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        jCaf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCadbe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCadbe, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCba.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCba, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCcis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCcis, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCoed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCoed, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jChk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCpspa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCpspa, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCssd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCssd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCs, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jCthtm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 2, true));
        jPanelColleges.add(jCthtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 280, 300));

        jTextLocation.setColumns(20);
        jTextLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextLocation.setLineWrap(true);
        jTextLocation.setRows(5);
        jScrollPane8.setViewportView(jTextLocation);

        jPanelColleges.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 680, 90));

        jTextDesc.setColumns(20);
        jTextDesc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextDesc.setLineWrap(true);
        jTextDesc.setRows(5);
        jScrollPane9.setViewportView(jTextDesc);

        jPanelColleges.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 370, 300));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Untitled design.png"))); // NOI18N
        jPanelColleges.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        JTabbedNavigation.addTab("tab7", jPanelColleges);

        jPanelClubs.setMaximumSize(new java.awt.Dimension(1080, 480));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-1080x900.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelClubsLayout = new javax.swing.GroupLayout(jPanelClubs);
        jPanelClubs.setLayout(jPanelClubsLayout);
        jPanelClubsLayout.setHorizontalGroup(
            jPanelClubsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
            .addGroup(jPanelClubsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClubsLayout.setVerticalGroup(
            jPanelClubsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(jPanelClubsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE))
        );

        JTabbedNavigation.addTab("tab8", jPanelClubs);

        jPanelSTEvaluation.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSTEvaluation.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanelSTEvaluation.setMaximumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation.setMinimumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRBYes1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(jRBYes1);
        jRBYes1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes1.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes1.setText("Yes");
        jRBYes1.setContentAreaFilled(false);
        jRBYes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 70, 30));

        jRBNo1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(jRBNo1);
        jRBNo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo1.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo1.setContentAreaFilled(false);
        jRBNo1.setLabel("No");
        jRBNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 60, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("8. Do you intend to pursue Sports Related Track?");
        jPanelSTEvaluation.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("-Enter your Grade 10 Academic Performance ");
        jPanelSTEvaluation.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("2. Do you intend to work in the ICT industry?");
        jPanelSTEvaluation.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("3. Do you intend to pursue Industrial Arts?");
        jPanelSTEvaluation.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("4. Do you have interest at Home Economics?");
        jPanelSTEvaluation.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("5. Is it okay for you to spend years in College?");
        jPanelSTEvaluation.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("6. Do you intend to pursue Academic Related Track?");
        jPanelSTEvaluation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("7. Do you intend to pursue Arts Related Track?");
        jPanelSTEvaluation.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 30));

        jRBYes2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup2.add(jRBYes2);
        jRBYes2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes2.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes2.setText("Yes");
        jRBYes2.setContentAreaFilled(false);
        jRBYes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, 30));

        jRBNo2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup2.add(jRBNo2);
        jRBNo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo2.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo2.setContentAreaFilled(false);
        jRBNo2.setLabel("No");
        jRBNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 60, 30));

        jRBYes3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup3.add(jRBYes3);
        jRBYes3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes3.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes3.setText("Yes");
        jRBYes3.setContentAreaFilled(false);
        jRBYes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 30));

        jRBYes4.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup4.add(jRBYes4);
        jRBYes4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes4.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes4.setText("Yes");
        jRBYes4.setContentAreaFilled(false);
        jRBYes4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRBYes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes4ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, 30));

        jRBNo4.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup4.add(jRBNo4);
        jRBNo4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo4.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo4.setContentAreaFilled(false);
        jRBNo4.setLabel("No");
        jRBNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo4ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 60, 30));

        jRBYes5.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup5.add(jRBYes5);
        jRBYes5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes5.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes5.setText("Yes");
        jRBYes5.setContentAreaFilled(false);
        jRBYes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes5ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 70, 30));

        jRBNo5.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup5.add(jRBNo5);
        jRBNo5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo5.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo5.setContentAreaFilled(false);
        jRBNo5.setLabel("No");
        jRBNo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo5ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 60, 30));

        jRBYes6.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup6.add(jRBYes6);
        jRBYes6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes6.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes6.setText("Yes");
        jRBYes6.setContentAreaFilled(false);
        jRBYes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes6ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 70, 30));

        jRBNo6.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup6.add(jRBNo6);
        jRBNo6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo6.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo6.setContentAreaFilled(false);
        jRBNo6.setLabel("No");
        jRBNo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo6ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 60, 30));

        jRBYes7.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup7.add(jRBYes7);
        jRBYes7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes7.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes7.setText("Yes");
        jRBYes7.setContentAreaFilled(false);
        jRBYes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes7ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 70, 30));

        jRBNo7.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup7.add(jRBNo7);
        jRBNo7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo7.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo7.setContentAreaFilled(false);
        jRBNo7.setLabel("No");
        jRBNo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo7ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 60, 30));

        jRBYes8.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup8.add(jRBYes8);
        jRBYes8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBYes8.setForeground(new java.awt.Color(51, 51, 51));
        jRBYes8.setText("Yes");
        jRBYes8.setContentAreaFilled(false);
        jRBYes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYes8ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBYes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 70, 20));

        jRBNo8.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup8.add(jRBNo8);
        jRBNo8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo8.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo8.setContentAreaFilled(false);
        jRBNo8.setLabel("No");
        jRBNo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo8ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 60, 20));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanelSTEvaluation.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 10, 490));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("1. Do you intend to pursue College?");
        jPanelSTEvaluation.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("General Average");
        jPanelSTEvaluation.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("NCAE RESULTS - PERCENTILE RANK");
        jPanelSTEvaluation.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, -1, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("MATH");
        jPanelSTEvaluation.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("ENGLISH");
        jPanelSTEvaluation.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Academic Track");
        jPanelSTEvaluation.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("SCIENCE");
        jPanelSTEvaluation.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, 30));

        jTFMath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFMath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMathActionPerformed(evt);
            }
        });
        jTFMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMathKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 100, -1));

        jTFFilipino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFFilipino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFFilipino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFilipinoActionPerformed(evt);
            }
        });
        jTFFilipino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFFilipinoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFilipinoKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFFilipino, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 100, -1));

        jTFEnglish.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFEnglish.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnglishActionPerformed(evt);
            }
        });
        jTFEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEnglishKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 100, -1));

        jTFArts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFArts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFArts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFArtsActionPerformed(evt);
            }
        });
        jTFArts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFArtsKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFArts, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 100, -1));

        jTFScience.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFScience.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFScience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFScienceActionPerformed(evt);
            }
        });
        jTFScience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFScienceKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFScience, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 100, -1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelSTEvaluation.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 430, 10));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23.setText("ACADEMIC RATING");
        jPanelSTEvaluation.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 40));

        jCBNcae.setBackground(new java.awt.Color(245, 245, 245));
        jCBNcae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBNcae.setForeground(new java.awt.Color(102, 102, 102));
        jCBNcae.setText("Don't Include this on evaluation");
        jCBNcae.setContentAreaFilled(false);
        jCBNcae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNcaeActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jCBNcae, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("FILIPINO");
        jPanelSTEvaluation.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 30));

        jTFGenAve.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFGenAve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFGenAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFGenAveActionPerformed(evt);
            }
        });
        jTFGenAve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFGenAveKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFGenAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 171, 80, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("TVL Track");
        jPanelSTEvaluation.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, 30));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Arts & Design Track");
        jPanelSTEvaluation.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, 30));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Sports Track");
        jPanelSTEvaluation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, 30));

        jTFAcademic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFAcademic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFAcademic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAcademicActionPerformed(evt);
            }
        });
        jTFAcademic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAcademicKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFAcademic, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 100, -1));

        jTFSports.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFSports.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSportsActionPerformed(evt);
            }
        });
        jTFSports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFSportsKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFSports, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 100, -1));

        jTFTVL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFTVL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTVLActionPerformed(evt);
            }
        });
        jTFTVL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTVLKeyTyped(evt);
            }
        });
        jPanelSTEvaluation.add(jTFTVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 100, -1));

        jLabelNextArrow.setBackground(new java.awt.Color(136, 0, 0));
        jLabelNextArrow.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNextArrow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNextArrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow.setText("Next");
        jLabelNextArrow.setOpaque(true);
        jLabelNextArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrowMouseExited(evt);
            }
        });
        jPanelSTEvaluation.add(jLabelNextArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 70, 30));

        jCBAcadRating.setBackground(new java.awt.Color(245, 245, 245));
        jCBAcadRating.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCBAcadRating.setText("Don't Include this on evaluation");
        jCBAcadRating.setContentAreaFilled(false);
        jCBAcadRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBAcadRatingMouseClicked(evt);
            }
        });
        jCBAcadRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAcadRatingActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jCBAcadRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel72.setText("STRAND AND TRACK EVALUATION");
        jPanelSTEvaluation.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 350, 40));

        jRBNo3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup3.add(jRBNo3);
        jRBNo3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRBNo3.setForeground(new java.awt.Color(51, 51, 51));
        jRBNo3.setContentAreaFilled(false);
        jRBNo3.setLabel("No");
        jRBNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNo3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation.add(jRBNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 60, 30));

        JTabbedNavigation.addTab("tab10", jPanelSTEvaluation);

        jPanelSTEvaluation_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSTEvaluation_1.setMaximumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_1.setMinimumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_1.setPreferredSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBackArrow1.setBackground(new java.awt.Color(136, 0, 0));
        jLabelBackArrow1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelBackArrow1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBackArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackArrow1.setText("Back");
        jLabelBackArrow1.setOpaque(true);
        jLabelBackArrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBackArrow1MouseExited(evt);
            }
        });
        jPanelSTEvaluation_1.add(jLabelBackArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 442, 63, 31));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(136, 0, 0));
        jLabel42.setText("LIKELY");
        jPanelSTEvaluation_1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 40, 74, 30));

        jRB1_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_3);
        jRB1_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB1_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_3.setText("3");
        jRB1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 88, -1, -1));

        jRB1_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_1);
        jRB1_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB1_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_1.setText("1");
        jRB1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 88, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("RATE EVALUATION");
        jPanelSTEvaluation_1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 30));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(136, 0, 0));
        jLabel44.setText("NOT LIKELY");
        jPanelSTEvaluation_1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 40, -1, 30));

        jRB1_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup9.add(jRB1_2);
        jRB1_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB1_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB1_2.setText("2");
        jRB1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 88, -1, -1));

        jRB2_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_1);
        jRB2_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB2_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_1.setText("1");
        jRB2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 133, -1, -1));

        jRB2_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_2);
        jRB2_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB2_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_2.setText("2");
        jRB2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 133, -1, -1));

        jRB2_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup10.add(jRB2_3);
        jRB2_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB2_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB2_3.setText("3");
        jRB2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 133, -1, -1));

        jRB3_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_1);
        jRB3_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB3_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_1.setText("1");
        jRB3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 178, -1, -1));

        jRB3_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_2);
        jRB3_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB3_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_2.setText("2");
        jRB3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 178, -1, -1));

        jRB3_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup11.add(jRB3_3);
        jRB3_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB3_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB3_3.setText("3");
        jRB3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 178, -1, -1));

        jRB4_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_1);
        jRB4_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB4_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_1.setText("1");
        jRB4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 223, -1, -1));

        jRB4_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_2);
        jRB4_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB4_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_2.setText("2");
        jRB4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 223, -1, -1));

        jRB4_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup12.add(jRB4_3);
        jRB4_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB4_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB4_3.setText("3");
        jRB4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB4_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 223, -1, -1));

        jRB5_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_1);
        jRB5_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB5_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_1.setText("1");
        jRB5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 271, -1, -1));

        jRB5_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_2);
        jRB5_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB5_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_2.setText("2");
        jRB5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 271, -1, -1));

        jRB5_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup13.add(jRB5_3);
        jRB5_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB5_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB5_3.setText("3");
        jRB5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB5_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 271, -1, -1));

        jRB6_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_1);
        jRB6_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB6_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_1.setText("1");
        jRB6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 316, -1, -1));

        jRB6_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_2);
        jRB6_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB6_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_2.setText("2");
        jRB6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 316, -1, -1));

        jRB6_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup14.add(jRB6_3);
        jRB6_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB6_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB6_3.setText("3");
        jRB6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB6_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB6_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 316, -1, -1));

        jRB7_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_1);
        jRB7_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB7_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_1.setText("1");
        jRB7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 361, -1, -1));

        jRB7_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_2);
        jRB7_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB7_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_2.setText("2");
        jRB7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 361, -1, -1));

        jRB7_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup15.add(jRB7_3);
        jRB7_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB7_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB7_3.setText("3");
        jRB7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB7_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 361, -1, -1));

        jRB8_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_1);
        jRB8_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB8_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_1.setText("1");
        jRB8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 406, -1, -1));

        jRB8_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_2);
        jRB8_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB8_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_2.setText("2");
        jRB8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 406, -1, -1));

        jRB8_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup16.add(jRB8_3);
        jRB8_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB8_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB8_3.setText("3");
        jRB8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB8_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_1.add(jRB8_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 406, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 0, -1, 481));

        jLabelNextArrow1.setBackground(new java.awt.Color(136, 0, 0));
        jLabelNextArrow1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNextArrow1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNextArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow1.setText("Next");
        jLabelNextArrow1.setOpaque(true);
        jLabelNextArrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow1MouseExited(evt);
            }
        });
        jPanelSTEvaluation_1.add(jLabelNextArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, 60, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("1. Do you intend to pursue Accountancy, Business, and Management (ABM)?");
        jPanelSTEvaluation_1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 81, 564, 28));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("2. Do you intend to pursue Science, Technology, Engineering and Mathematics (STEM)?");
        jPanelSTEvaluation_1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 127, 564, 33));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("3. Do you intend to pursue Humanities and Social Science (HUMMS)?");
        jPanelSTEvaluation_1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 178, 564, 30));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("4. Do you want to pursue or are you great at Animation?");
        jPanelSTEvaluation_1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 219, 564, 33));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("5. Do you have an interest at Performing Arts (Dance, Music, Theatre Arts)?");
        jPanelSTEvaluation_1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 270, 564, 28));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("6. Do you have an interest at Film Production?");
        jPanelSTEvaluation_1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 316, 564, 28));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("7. Do you have an interest at being an Athlete or Sport Coach?");
        jPanelSTEvaluation_1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 362, 564, 28));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("8. Do you have an interest at Sports Officiating?");
        jPanelSTEvaluation_1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 408, 564, 28));

        JTabbedNavigation.addTab("tab10", jPanelSTEvaluation_1);

        jPanelSTEvaluation_2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("16. Do you have an interest at Business Process Outsourcing? ");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(136, 0, 0));
        jLabel45.setText("LIKELY");

        jLabelNextArrow3.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNextArrow3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow3.setText("Back");
        jLabelNextArrow3.setOpaque(true);
        jLabelNextArrow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow3MouseExited(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("9. Do you have an interest at Hotel and Restaurant Servicing?");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("10. Do you have an interest at Tourism Servicing?");

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("11. Do you have an interest at Food Production?");

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("12. Do you have an interest at Health Care Services?");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("13. Do you have an interest at Emergency Medical Services?");

        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("14. Do you have an interest at Computer Programming?");

        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("15. Do you have an interest at Computer System Servicing?");

        jRB9_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_3);
        jRB9_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB9_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_3.setText("3");
        jRB9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_3ActionPerformed(evt);
            }
        });

        jRB9_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_1);
        jRB9_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB9_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_1.setText("1");
        jRB9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_1ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(136, 0, 0));
        jLabel47.setText("RATE EVALUATION");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(136, 0, 0));
        jLabel48.setText("NOT LIKELY");

        jRB9_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup17.add(jRB9_2);
        jRB9_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB9_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB9_2.setText("2");
        jRB9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB9_2ActionPerformed(evt);
            }
        });

        jRB10_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_1);
        jRB10_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB10_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_1.setText("1");
        jRB10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_1ActionPerformed(evt);
            }
        });

        jRB10_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_2);
        jRB10_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB10_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_2.setText("2");
        jRB10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_2ActionPerformed(evt);
            }
        });

        jRB10_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup18.add(jRB10_3);
        jRB10_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB10_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB10_3.setText("3");
        jRB10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB10_3ActionPerformed(evt);
            }
        });

        jRB11_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_1);
        jRB11_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB11_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_1.setText("1");
        jRB11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_1ActionPerformed(evt);
            }
        });

        jRB11_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_2);
        jRB11_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB11_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_2.setText("2");
        jRB11_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_2ActionPerformed(evt);
            }
        });

        jRB11_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup19.add(jRB11_3);
        jRB11_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB11_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB11_3.setText("3");
        jRB11_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB11_3ActionPerformed(evt);
            }
        });

        jRB12_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_1);
        jRB12_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB12_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_1.setText("1");
        jRB12_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_1ActionPerformed(evt);
            }
        });

        jRB12_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_2);
        jRB12_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB12_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_2.setText("2");
        jRB12_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_2ActionPerformed(evt);
            }
        });

        jRB12_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup20.add(jRB12_3);
        jRB12_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB12_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB12_3.setText("3");
        jRB12_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB12_3ActionPerformed(evt);
            }
        });

        jRB13_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_1);
        jRB13_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB13_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_1.setText("1");
        jRB13_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_1ActionPerformed(evt);
            }
        });

        jRB13_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_2);
        jRB13_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB13_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_2.setText("2");
        jRB13_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_2ActionPerformed(evt);
            }
        });

        jRB13_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup21.add(jRB13_3);
        jRB13_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB13_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB13_3.setText("3");
        jRB13_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB13_3ActionPerformed(evt);
            }
        });

        jRB14_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_1);
        jRB14_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB14_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_1.setText("1");
        jRB14_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_1ActionPerformed(evt);
            }
        });

        jRB14_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_2);
        jRB14_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB14_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_2.setText("2");
        jRB14_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_2ActionPerformed(evt);
            }
        });

        jRB14_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup22.add(jRB14_3);
        jRB14_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB14_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB14_3.setText("3");
        jRB14_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB14_3ActionPerformed(evt);
            }
        });

        jRB15_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_1);
        jRB15_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB15_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_1.setText("1");
        jRB15_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_1ActionPerformed(evt);
            }
        });

        jRB15_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_2);
        jRB15_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB15_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_2.setText("2");
        jRB15_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_2ActionPerformed(evt);
            }
        });

        jRB15_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup23.add(jRB15_3);
        jRB15_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB15_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB15_3.setText("3");
        jRB15_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB15_3ActionPerformed(evt);
            }
        });

        jRB16_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_1);
        jRB16_1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB16_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_1.setText("1");
        jRB16_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_1ActionPerformed(evt);
            }
        });

        jRB16_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_2);
        jRB16_2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB16_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_2.setText("2");
        jRB16_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_2ActionPerformed(evt);
            }
        });

        jRB16_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup24.add(jRB16_3);
        jRB16_3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jRB16_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB16_3.setText("3");
        jRB16_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB16_3ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelNextArrow4.setBackground(new java.awt.Color(245, 245, 245));
        jLabelNextArrow4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNextArrow4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextArrow4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow4.setText("Next");
        jLabelNextArrow4.setOpaque(true);
        jLabelNextArrow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSTEvaluation_2Layout = new javax.swing.GroupLayout(jPanelSTEvaluation_2);
        jPanelSTEvaluation_2.setLayout(jPanelSTEvaluation_2Layout);
        jPanelSTEvaluation_2Layout.setHorizontalGroup(
            jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNextArrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel46)
                            .addComponent(jLabel35)
                            .addComponent(jLabel47))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNextArrow4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel45)
                        .addGap(36, 36, 36))
                    .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                .addComponent(jRB10_1)
                                .addGap(265, 265, 265))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRB12_1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB13_1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB14_1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB15_1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB16_1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(154, 154, 154)))
                        .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                            .addComponent(jRB11_1)
                            .addGap(84, 84, 84)))
                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addComponent(jRB9_1)
                        .addGap(73, 73, 73)
                        .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRB12_2)
                            .addComponent(jRB14_2)
                            .addComponent(jRB15_2)
                            .addComponent(jRB16_2)
                            .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                                    .addComponent(jRB10_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRB10_3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                                    .addComponent(jRB9_2)
                                    .addGap(65, 65, 65)
                                    .addComponent(jRB9_3))
                                .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                    .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRB11_2)
                                        .addComponent(jRB13_2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRB13_3)
                                        .addComponent(jRB11_3)
                                        .addComponent(jRB12_3)
                                        .addComponent(jRB14_3)
                                        .addComponent(jRB15_3)
                                        .addComponent(jRB16_3)))))
                        .addGap(57, 57, 57))))
        );
        jPanelSTEvaluation_2Layout.setVerticalGroup(
            jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addComponent(jLabelNextArrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSTEvaluation_2Layout.createSequentialGroup()
                        .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                .addComponent(jRB9_3)
                                .addGap(21, 21, 21)
                                .addComponent(jRB10_3)
                                .addGap(18, 18, 18)
                                .addComponent(jRB11_3)
                                .addGap(18, 18, 18)
                                .addComponent(jRB12_3)
                                .addGap(27, 27, 27)
                                .addComponent(jRB13_3)
                                .addGap(18, 18, 18)
                                .addComponent(jRB14_3)
                                .addGap(18, 18, 18)
                                .addComponent(jRB15_3))
                            .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                        .addComponent(jRB9_2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRB10_2)
                                        .addGap(21, 21, 21)
                                        .addComponent(jRB11_2)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRB12_2)
                                            .addComponent(jRB12_1)))
                                    .addGroup(jPanelSTEvaluation_2Layout.createSequentialGroup()
                                        .addComponent(jRB9_1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRB10_1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRB11_1)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRB13_2)
                                    .addComponent(jRB13_1))
                                .addGap(21, 21, 21)
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRB14_2)
                                    .addComponent(jRB14_1))
                                .addGap(21, 21, 21)
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRB15_2)
                                    .addComponent(jRB15_1))
                                .addGap(21, 21, 21)
                                .addGroup(jPanelSTEvaluation_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRB16_2)
                                    .addComponent(jRB16_1)
                                    .addComponent(jRB16_3))))
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNextArrow4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JTabbedNavigation.addTab("tab10", jPanelSTEvaluation_2);

        jPanelSTEvaluation_4.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelResultTrack2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabelResultTrack2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResultTrack2.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultTrack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, 40));

        jLabel69.setBackground(new java.awt.Color(245, 245, 245));
        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(136, 0, 0));
        jLabel69.setText("RESULTS");
        jPanelSTEvaluation_4.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 30));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("your discretion.");
        jPanelSTEvaluation_4.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 200, 90));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel71.setBackground(new java.awt.Color(245, 245, 245));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("> HUMMS Strand -");

        jLabel75.setBackground(new java.awt.Color(245, 245, 245));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("> STEM Strand -");

        jLabel76.setBackground(new java.awt.Color(245, 245, 245));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 51, 51));
        jLabel76.setText("> ABM Strand -");

        jLabelHUMMS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelHUMMS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHUMMS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelHUMMS.setText("--");

        jLabelSTEM.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSTEM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSTEM.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSTEM.setText("--");

        jLabelABM.setBackground(new java.awt.Color(245, 245, 245));
        jLabelABM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelABM.setForeground(new java.awt.Color(219, 166, 37));
        jLabelABM.setText("--");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHUMMS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSTEM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelABM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabelHUMMS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabelSTEM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabelABM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 90));

        jLabel74.setBackground(new java.awt.Color(245, 245, 245));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(219, 166, 37));
        jLabel74.setText(" TECHNICAL-VOCATIONAL-LIVELIHOOD  TRACK =");
        jPanelSTEvaluation_4.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 40));

        jLabel77.setBackground(new java.awt.Color(245, 245, 245));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(219, 166, 37));
        jLabel77.setText("ACADEMIC TRACK =");
        jPanelSTEvaluation_4.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jLabelPERFORMING_ARTS22.setBackground(new java.awt.Color(245, 245, 245));
        jLabelPERFORMING_ARTS22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setBackground(new java.awt.Color(245, 245, 245));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("> Performing Arts -");

        jLabel79.setBackground(new java.awt.Color(245, 245, 245));
        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 51));
        jLabel79.setText("1. Dance");

        jLabel80.setBackground(new java.awt.Color(245, 245, 245));
        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 51));
        jLabel80.setText("2. Music");

        jLabel81.setBackground(new java.awt.Color(245, 245, 245));
        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("3. Theatre Arts");

        jLabel82.setBackground(new java.awt.Color(245, 245, 245));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("> Film Production -");

        jLabel83.setBackground(new java.awt.Color(245, 245, 245));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setText("> Animation -");

        jLabelPERFORMING_ARTS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelPERFORMING_ARTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPERFORMING_ARTS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelPERFORMING_ARTS.setText("--");

        jLabelFILM_PRODUCTION.setBackground(new java.awt.Color(245, 245, 245));
        jLabelFILM_PRODUCTION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFILM_PRODUCTION.setForeground(new java.awt.Color(219, 166, 37));
        jLabelFILM_PRODUCTION.setText("--");

        jLabelANIMATION.setBackground(new java.awt.Color(245, 245, 245));
        jLabelANIMATION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelANIMATION.setForeground(new java.awt.Color(219, 166, 37));
        jLabelANIMATION.setText("--");

        javax.swing.GroupLayout jLabelPERFORMING_ARTS22Layout = new javax.swing.GroupLayout(jLabelPERFORMING_ARTS22);
        jLabelPERFORMING_ARTS22.setLayout(jLabelPERFORMING_ARTS22Layout);
        jLabelPERFORMING_ARTS22Layout.setHorizontalGroup(
            jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPERFORMING_ARTS))
                            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFILM_PRODUCTION))))
                    .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelANIMATION)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jLabelPERFORMING_ARTS22Layout.setVerticalGroup(
            jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPERFORMING_ARTS22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabelPERFORMING_ARTS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabelFILM_PRODUCTION))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabelPERFORMING_ARTS22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabelANIMATION))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jLabelPERFORMING_ARTS22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, -1));

        jLabel84.setBackground(new java.awt.Color(245, 245, 245));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(219, 166, 37));
        jLabel84.setText("ARTS & DESIGN TRACK =");
        jPanelSTEvaluation_4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 40));

        jPanel10.setBackground(new java.awt.Color(245, 245, 245));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel85.setBackground(new java.awt.Color(245, 245, 245));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(51, 51, 51));
        jLabel85.setText("> Sports Officiating -");

        jLabel86.setBackground(new java.awt.Color(245, 245, 245));
        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 51, 51));
        jLabel86.setText("> Sports Coaching -");

        jLabelSPORTS_OFFICIATING.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSPORTS_OFFICIATING.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSPORTS_OFFICIATING.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSPORTS_OFFICIATING.setText("--");

        jLabelSPORTS_COACHING.setBackground(new java.awt.Color(245, 245, 245));
        jLabelSPORTS_COACHING.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSPORTS_COACHING.setForeground(new java.awt.Color(219, 166, 37));
        jLabelSPORTS_COACHING.setText("--");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSPORTS_OFFICIATING)
                    .addComponent(jLabelSPORTS_COACHING))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabelSPORTS_OFFICIATING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabelSPORTS_COACHING)))
        );

        jPanelSTEvaluation_4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 220, 60));

        jLabel87.setBackground(new java.awt.Color(245, 245, 245));
        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(219, 166, 37));
        jLabel87.setText("SPORTS TRACK =");
        jPanelSTEvaluation_4.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 40));

        jPanel11.setBackground(new java.awt.Color(245, 245, 245));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel88.setBackground(new java.awt.Color(245, 245, 245));
        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 51, 51));
        jLabel88.setText("> Home Economics Strand -");

        jLabel89.setBackground(new java.awt.Color(245, 245, 245));
        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 51, 51));
        jLabel89.setText("1. Hotel & Restaurant Servicing");

        jLabel90.setBackground(new java.awt.Color(245, 245, 245));
        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(51, 51, 51));
        jLabel90.setText("2. Tourism Servicing");

        jLabel91.setBackground(new java.awt.Color(245, 245, 245));
        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(51, 51, 51));
        jLabel91.setText("3. Food Production");

        jLabel92.setBackground(new java.awt.Color(245, 245, 245));
        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(51, 51, 51));
        jLabel92.setText("4. Health Care Services");

        jLabel93.setBackground(new java.awt.Color(245, 245, 245));
        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 51, 51));
        jLabel93.setText("5. Emergency Medical Services");

        jLabel94.setBackground(new java.awt.Color(245, 245, 245));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 51, 51));
        jLabel94.setText("> ICT Strand -");

        jLabel95.setBackground(new java.awt.Color(245, 245, 245));
        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("1. Computer Programming");

        jLabel96.setBackground(new java.awt.Color(245, 245, 245));
        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 51, 51));
        jLabel96.setText("2. Computer System Servicing");

        jLabel97.setBackground(new java.awt.Color(245, 245, 245));
        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(51, 51, 51));
        jLabel97.setText("3. Business Process Outsourcing");

        jLabel98.setBackground(new java.awt.Color(245, 245, 245));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(51, 51, 51));
        jLabel98.setText("* Other Strand/s are not included *");
        jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel98.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabelHOME_ECONOMICS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelHOME_ECONOMICS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHOME_ECONOMICS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelHOME_ECONOMICS.setText("--");

        jLabelICT.setBackground(new java.awt.Color(245, 245, 245));
        jLabelICT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelICT.setForeground(new java.awt.Color(219, 166, 37));
        jLabelICT.setText("--");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHOME_ECONOMICS))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelICT))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabelHOME_ECONOMICS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabelICT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSTEvaluation_4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 290, 280));

        jPanel13.setBackground(new java.awt.Color(245, 245, 245));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel99.setBackground(new java.awt.Color(245, 245, 245));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(51, 51, 51));
        jLabel99.setText("> Industrial Arts Strand -");

        jLabel100.setBackground(new java.awt.Color(245, 245, 245));
        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 51, 51));
        jLabel100.setText("1. Drafting Technology");

        jLabel101.setBackground(new java.awt.Color(245, 245, 245));
        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 51, 51));
        jLabel101.setText("2. Automotive Servicing");

        jLabel102.setBackground(new java.awt.Color(245, 245, 245));
        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("3. Electronic Products Services");

        jLabel103.setBackground(new java.awt.Color(245, 245, 245));
        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("4. Electrical Maintenance");

        jLabel104.setBackground(new java.awt.Color(245, 245, 245));
        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("5. Construction Technology");

        jLabel105.setBackground(new java.awt.Color(245, 245, 245));
        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(51, 51, 51));
        jLabel105.setText("6. Welding Technology");

        jLabelINDUSTRIAL_ARTS.setBackground(new java.awt.Color(245, 245, 245));
        jLabelINDUSTRIAL_ARTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelINDUSTRIAL_ARTS.setForeground(new java.awt.Color(219, 166, 37));
        jLabelINDUSTRIAL_ARTS.setText("--");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelINDUSTRIAL_ARTS))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jLabelINDUSTRIAL_ARTS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSTEvaluation_4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 220, 160));

        jPanel12.setBackground(new java.awt.Color(136, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1230, 10));

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(136, 0, 0));
        jLabel107.setText("Information: ");
        jPanelSTEvaluation_4.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 110, 90));

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Shown are the Points");
        jPanelSTEvaluation_4.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 180, 90));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Accumulated based on the");
        jPanelSTEvaluation_4.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 200, 90));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("evaluation. Don't take the");
        jPanelSTEvaluation_4.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 200, 90));

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
        jLabel111.setText("results seriously, the");
        jPanelSTEvaluation_4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 200, 90));

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("final decision is still in ");
        jPanelSTEvaluation_4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 200, 90));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(136, 0, 0));
        jLabel70.setText("Suggestion:");
        jPanelSTEvaluation_4.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 40));

        jLabelResultStrand.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabelResultStrand.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResultStrand.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultStrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, 40));

        jLabelResultSportsTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultSportsTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultSportsTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultSportsTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 50, 40));

        jLabelResultAcadTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultAcadTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultAcadTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultAcadTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 60, 40));

        jLabelResultArtsTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultArtsTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultArtsTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultArtsTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 40));

        jLabelResultTVLTrack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelResultTVLTrack.setForeground(new java.awt.Color(136, 0, 0));
        jLabelResultTVLTrack.setText("-");
        jPanelSTEvaluation_4.add(jLabelResultTVLTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 50, 40));

        jLabel113.setBackground(new java.awt.Color(245, 245, 245));
        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("99");
        jPanelSTEvaluation_4.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 143, -1));

        JTabbedNavigation.addTab("tab10", jPanelSTEvaluation_4);

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-1080x900.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelFunFactsLayout = new javax.swing.GroupLayout(jPanelFunFacts);
        jPanelFunFacts.setLayout(jPanelFunFactsLayout);
        jPanelFunFactsLayout.setHorizontalGroup(
            jPanelFunFactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
            .addGroup(jPanelFunFactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFunFactsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel141)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelFunFactsLayout.setVerticalGroup(
            jPanelFunFactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanelFunFactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFunFactsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JTabbedNavigation.addTab("tab11", jPanelFunFacts);

        jPanelSTEvaluation_3.setBackground(new java.awt.Color(245, 245, 245));
        jPanelSTEvaluation_3.setMaximumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_3.setMinimumSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_3.setPreferredSize(new java.awt.Dimension(1080, 480));
        jPanelSTEvaluation_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(136, 0, 0));
        jLabel50.setText("LIKELY");
        jPanelSTEvaluation_3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 30));

        jLabelNextArrow5.setBackground(new java.awt.Color(136, 0, 0));
        jLabelNextArrow5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNextArrow5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNextArrow5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextArrow5.setText("Back");
        jLabelNextArrow5.setOpaque(true);
        jLabelNextArrow5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNextArrow5MouseExited(evt);
            }
        });
        jPanelSTEvaluation_3.add(jLabelNextArrow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 70, 30));

        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("17. Do you have an interest at Drafting Technology?");
        jPanelSTEvaluation_3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 40));

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("18. Do you have an interest at Automotive Servicing?");
        jPanelSTEvaluation_3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 40));

        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("19. Do you have an interest at Electronic Products Assembly & Services?");
        jPanelSTEvaluation_3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 40));

        jLabel54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("20. Do you have an interest at Electrical Installation & Maintenance?");
        jPanelSTEvaluation_3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 40));

        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("21. Do you have an interest at Construction Technology?");
        jPanelSTEvaluation_3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 40));

        jRB17_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_3);
        jRB17_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_3.setText("3");
        jRB17_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 65, -1, -1));

        jRB17_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_1);
        jRB17_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_1.setText("1");
        jRB17_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 65, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(136, 0, 0));
        jLabel58.setText("RATE EVALUATION");
        jPanelSTEvaluation_3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(136, 0, 0));
        jLabel59.setText("NOT LIKELY");
        jPanelSTEvaluation_3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 20, -1, 30));

        jRB17_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup25.add(jRB17_2);
        jRB17_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB17_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB17_2.setText("2");
        jRB17_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB17_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB17_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 65, -1, -1));

        jRB18_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_1);
        jRB18_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_1.setText("1");
        jRB18_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 115, -1, -1));

        jRB18_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_2);
        jRB18_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_2.setText("2");
        jRB18_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 115, -1, -1));

        jRB18_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup26.add(jRB18_3);
        jRB18_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB18_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB18_3.setText("3");
        jRB18_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB18_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB18_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 115, -1, -1));

        jRB19_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_1);
        jRB19_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_1.setText("1");
        jRB19_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 165, -1, -1));

        jRB19_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_2);
        jRB19_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_2.setText("2");
        jRB19_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 165, -1, -1));

        jRB19_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup27.add(jRB19_3);
        jRB19_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB19_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB19_3.setText("3");
        jRB19_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB19_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB19_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 165, -1, -1));

        jRB20_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_1);
        jRB20_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_1.setText("1");
        jRB20_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 215, -1, -1));

        jRB20_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_2);
        jRB20_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_2.setText("2");
        jRB20_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 215, -1, -1));

        jRB20_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup28.add(jRB20_3);
        jRB20_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB20_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB20_3.setText("3");
        jRB20_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB20_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB20_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 215, -1, -1));

        jRB21_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_1);
        jRB21_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_1.setText("1");
        jRB21_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 265, -1, -1));

        jRB21_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_2);
        jRB21_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_2.setText("2");
        jRB21_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 265, -1, -1));

        jRB21_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup29.add(jRB21_3);
        jRB21_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB21_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB21_3.setText("3");
        jRB21_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB21_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB21_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 265, -1, -1));

        jRB22_1.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_1);
        jRB22_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_1.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_1.setText("1");
        jRB22_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_1ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 315, -1, -1));

        jRB22_2.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_2);
        jRB22_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_2.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_2.setText("2");
        jRB22_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_2ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 315, -1, -1));

        jRB22_3.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup30.add(jRB22_3);
        jRB22_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRB22_3.setForeground(new java.awt.Color(51, 51, 51));
        jRB22_3.setText("3");
        jRB22_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB22_3ActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jRB22_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 315, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelSTEvaluation_3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 10, 480));

        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("22. Do you have an interest at Welding Technology?");
        jPanelSTEvaluation_3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 40));

        jButtonRessults.setBackground(new java.awt.Color(136, 0, 0));
        jButtonRessults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonRessults.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRessults.setText("Generate Results");
        jButtonRessults.setBorder(null);
        jButtonRessults.setFocusable(false);
        jButtonRessults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRessultsMouseExited(evt);
            }
        });
        jButtonRessults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRessultsActionPerformed(evt);
            }
        });
        jPanelSTEvaluation_3.add(jButtonRessults, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 380, 290, 50));

        jLabel60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(136, 0, 0));
        jLabel60.setText("Notice: This evaluation MUST NOT be taken as the final. It is still in the applicant's  ");
        jPanelSTEvaluation_3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 20));

        jLabel61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(136, 0, 0));
        jLabel61.setText("final decision and passion that will matter the most, ");
        jPanelSTEvaluation_3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, 20));

        JTabbedNavigation.addTab("tab10", jPanelSTEvaluation_3);

        getContentPane().add(JTabbedNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 1080, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int result = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to log out?",
        "Log Out Confirmation",
        JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            SignIn retrieve = new SignIn();
            retrieve.pack();
            retrieve.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(new Color(136, 0, 0));
        jLabel1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 36));
        jLabel1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 36));
        jLabel1.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // String strSelected = jComboBox1.getSelectedItem().toString();
        
        String selectedOption = jComboBox1.getSelectedItem().toString();
    
        switch(selectedOption) {
            case "HOME":
                JTabbedNavigation.setSelectedIndex(0);
                break;
            case "HISTORY, MISSION, and VISION":
                JTabbedNavigation.setSelectedIndex(1);
                break;
            case "ACHIEVEMENTS":
                JTabbedNavigation.setSelectedIndex(2);
                ContentAchievements();
                break;
            case "FACILITIES":
                JTabbedNavigation.setSelectedIndex(3);
                break;
            case "ADMISSION/SCHOLARSHIP":
                JTabbedNavigation.setSelectedIndex(4);
                break;
            case "COLLEGES":
                JTabbedNavigation.setSelectedIndex(5);
                break;
            case "DEPARTMENT CLUBS":
                JTabbedNavigation.setSelectedIndex(6);
                break;
            case "STRAND AND TRACK EVALUATION":
                JTabbedNavigation.setSelectedIndex(7);
                break;
            case "PUP FUN FACTS":
                JTabbedNavigation.setSelectedIndex(12);
                break;
        }
        /*if (strSelected.equals("Strand and Track Evaluation")){
            JTabbedNavigation.setSelectedIndex(1); // to show the page of ST_Evaluation
 
        } else if (strSelected.equals("Home")){
            JTabbedNavigation.setSelectedIndex(0); // to show the page of Home
        }*/
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int result = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to exit?",
        "Exit Confirmation",
        JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setBackground(new Color(136, 0, 0));
        jLabel7.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabel7.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBackground(new Color(255, 255, 255));
        jLabel7.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabel7.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jRBYes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes1ActionPerformed

    private void jRBNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo1ActionPerformed

    private void jRBYes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes2ActionPerformed

    private void jRBNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo2ActionPerformed

    private void jRBYes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes3ActionPerformed

    private void jRBNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo3ActionPerformed

    private void jRBYes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes4ActionPerformed

    private void jRBNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo4ActionPerformed

    private void jRBYes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes5ActionPerformed

    private void jRBNo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo5ActionPerformed

    private void jRBYes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes6ActionPerformed

    private void jRBNo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo6ActionPerformed

    private void jRBYes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes7ActionPerformed

    private void jRBNo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo7ActionPerformed

    private void jRBYes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYes8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYes8ActionPerformed

    private void jRBNo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNo8ActionPerformed

    private void jTFMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMathActionPerformed

    private void jTFFilipinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFilipinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFilipinoActionPerformed

    private void jTFEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnglishActionPerformed

    private void jTFArtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFArtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFArtsActionPerformed

    private void jTFScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFScienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFScienceActionPerformed

    private void jCBNcaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNcaeActionPerformed
        if (jCBNcae.isSelected()){
            jTFAcademic.setEnabled(false);
            jTFSports.setEnabled(false);
            jTFTVL.setEnabled(false);
            jTFArts.setEnabled(false);
        } else{
            jTFAcademic.setEnabled(true);
            jTFSports.setEnabled(true);
            jTFTVL.setEnabled(true);
            jTFArts.setEnabled(true);
        }
    }//GEN-LAST:event_jCBNcaeActionPerformed

    private void jTFGenAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFGenAveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFGenAveActionPerformed

    private void jTFAcademicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAcademicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAcademicActionPerformed

    private void jTFSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSportsActionPerformed

    private void jTFTVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTVLActionPerformed

    private void jCBAcadRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAcadRatingActionPerformed
        if (jCBAcadRating.isSelected()){
            jTFFilipino.setEnabled(false);
            jTFEnglish.setEnabled(false);
            jTFGenAve.setEnabled(false);
            jTFScience.setEnabled(false);
            jTFMath.setEnabled(false);
        } else{
            jTFFilipino.setEnabled(true);
            jTFEnglish.setEnabled(true);
            jTFGenAve.setEnabled(true);
            jTFScience.setEnabled(true);
            jTFMath.setEnabled(true);
        }
    }//GEN-LAST:event_jCBAcadRatingActionPerformed

    private void jLabelNextArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseClicked
        String filText = jTFFilipino.getText(), engText = jTFEnglish.getText(), genText = jTFGenAve.getText(), mathText = jTFMath.getText(), sciText = jTFScience.getText();
        String AcadText = jTFAcademic.getText(), SportsText = jTFSports.getText(), TVLText = jTFTVL.getText(), ArtsText = jTFArts.getText();
        
        boolean choice_made = buttonGroup1.getSelection() != null && buttonGroup2.getSelection() != null && buttonGroup3.getSelection() != null && buttonGroup4.getSelection() != null && buttonGroup5.getSelection() != null && buttonGroup6.getSelection() != null && buttonGroup7.getSelection() != null && buttonGroup8.getSelection() != null;
        boolean grades_input = filText.isEmpty() || engText.isEmpty() || genText.isEmpty() || mathText.isEmpty() || sciText.isEmpty();
        boolean NCAE_input = AcadText.isEmpty() || SportsText.isEmpty() || TVLText.isEmpty() || ArtsText.isEmpty();
        boolean valid_grade = false, valid_NCAE = false;
        
        if (jCBAcadRating.isSelected()){
            grades_input = false;
            valid_grade = true;
        } else{
            int intConvertFil = filText.isEmpty() ? 0 : Integer.parseInt(filText);
            int intConvertEng = engText.isEmpty() ? 0 : Integer.parseInt(engText);
            int intConvertGen = genText.isEmpty() ? 0 : Integer.parseInt(genText);
            int intConvertMath = mathText.isEmpty() ? 0 : Integer.parseInt(mathText);
            int intConvertSci = sciText.isEmpty() ? 0 : Integer.parseInt(sciText);
            
            if ((intConvertFil < 60 || intConvertFil > 100) || (intConvertEng < 60 || intConvertEng > 100) || (intConvertGen < 60 || intConvertGen > 100) || (intConvertMath < 60 || intConvertMath > 100) || (intConvertSci < 60 || intConvertSci > 100)){
                JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
                return;
            } else{
                valid_grade = true;
            }
        }
        
        if (jCBNcae.isSelected()){
            NCAE_input = false;
            valid_NCAE = true;
        } else{
            int intConvertAcads = AcadText.isEmpty() ? 0 : Integer.parseInt(AcadText);
            int intConvertSports = SportsText.isEmpty() ? 0 : Integer.parseInt(SportsText);
            int intConvertTVL = TVLText.isEmpty() ? 0 : Integer.parseInt(TVLText);
            int intConvertArts = ArtsText.isEmpty() ? 0 : Integer.parseInt(ArtsText);
            
            if ((intConvertAcads < 60 || intConvertAcads > 100) || (intConvertSports< 60 || intConvertSports > 100) || (intConvertTVL < 60 || intConvertTVL > 100) || (intConvertArts < 60 || intConvertArts > 100)){
                JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
                return;
            } else{
                valid_NCAE = true;
            }
        }
        
        // VERIFICATION
        if (choice_made == true && grades_input == false && NCAE_input == false && valid_grade == true && valid_NCAE == true){
            JTabbedNavigation.setSelectedIndex(11);
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s (Range of Input is 60-100 only), please check again.","Incomplete/Invalid Response",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelNextArrowMouseClicked

    private void jLabelNextArrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseEntered
        jLabelNextArrow.setBackground(new Color(245, 245, 245));
        jLabelNextArrow.setFont(new Font("Segoe UI Symbol", Font.BOLD, 36));
        jLabelNextArrow.setForeground(new Color(136, 0, 0));
    }//GEN-LAST:event_jLabelNextArrowMouseEntered

    private void jLabelNextArrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrowMouseExited
        jLabelNextArrow.setBackground(new Color(245, 245, 245));
        jLabelNextArrow.setFont(new Font("Segoe UI Symbol", Font.BOLD, 36));
        jLabelNextArrow.setForeground(new Color(136, 0, 0));
    }//GEN-LAST:event_jLabelNextArrowMouseExited

    private void jTFFilipinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFilipinoKeyPressed

    }//GEN-LAST:event_jTFFilipinoKeyPressed

    private void jTFFilipinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFilipinoKeyTyped
        String strChecker = jTFFilipino.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFFilipinoKeyTyped

    private void jTFEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEnglishKeyTyped
        String strChecker = jTFEnglish.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFEnglishKeyTyped

    private void jTFGenAveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFGenAveKeyTyped
        String strChecker = jTFGenAve.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFGenAveKeyTyped

    private void jTFScienceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFScienceKeyTyped
        String strChecker = jTFScience.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFScienceKeyTyped

    private void jTFMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMathKeyTyped
        String strChecker = jTFMath.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFMathKeyTyped

    private void jTFAcademicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAcademicKeyTyped
        String strChecker = jTFAcademic.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFAcademicKeyTyped

    private void jTFSportsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSportsKeyTyped
        String strChecker = jTFSports.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFSportsKeyTyped

    private void jTFTVLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTVLKeyTyped
        String strChecker = jTFTVL.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFTVLKeyTyped

    private void jTFArtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFArtsKeyTyped
        String strChecker = jTFArts.getText();
        char c = evt.getKeyChar();
        
        if (((c < '0' || c > '9' ) && c !=  '\b') || strChecker.length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_jTFArtsKeyTyped

    private void jLabelBackArrow1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseExited
        jLabelBackArrow1.setBackground(new Color(245, 245, 245));
        jLabelBackArrow1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelBackArrow1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelBackArrow1MouseExited

    private void jLabelBackArrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseEntered
        jLabelBackArrow1.setBackground(new Color(245, 245, 245));
        jLabelBackArrow1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelBackArrow1.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelBackArrow1MouseEntered

    private void jLabelBackArrow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackArrow1MouseClicked
        JTabbedNavigation.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_jLabelBackArrow1MouseClicked

    private void jRB1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_3ActionPerformed

    private void jRB1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_1ActionPerformed

    private void jRB1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB1_2ActionPerformed

    private void jRB2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_1ActionPerformed

    private void jRB2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_2ActionPerformed

    private void jRB2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB2_3ActionPerformed

    private void jRB3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_1ActionPerformed

    private void jRB3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_2ActionPerformed

    private void jRB3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB3_3ActionPerformed

    private void jRB4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_1ActionPerformed

    private void jRB4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_2ActionPerformed

    private void jRB4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB4_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB4_3ActionPerformed

    private void jRB5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_1ActionPerformed

    private void jRB5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_2ActionPerformed

    private void jRB5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB5_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB5_3ActionPerformed

    private void jRB6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_1ActionPerformed

    private void jRB6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_2ActionPerformed

    private void jRB6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB6_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB6_3ActionPerformed

    private void jRB7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_1ActionPerformed

    private void jRB7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_2ActionPerformed

    private void jRB7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB7_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB7_3ActionPerformed

    private void jRB8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_1ActionPerformed

    private void jRB8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_2ActionPerformed

    private void jRB8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB8_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB8_3ActionPerformed

    private void jLabelNextArrow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseClicked
        JTabbedNavigation.setSelectedIndex(2);
    }//GEN-LAST:event_jLabelNextArrow3MouseClicked

    private void jLabelNextArrow3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseEntered
        jLabelNextArrow3.setBackground(new Color(245, 245, 245));
        jLabelNextArrow3.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow3.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow3MouseEntered

    private void jLabelNextArrow3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow3MouseExited
        jLabelNextArrow3.setBackground(new Color(245, 245, 245));
        jLabelNextArrow3.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow3.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow3MouseExited

    private void jRB9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_3ActionPerformed

    private void jRB9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_1ActionPerformed

    private void jRB9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB9_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB9_2ActionPerformed

    private void jRB10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_1ActionPerformed

    private void jRB10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_2ActionPerformed

    private void jRB10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB10_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB10_3ActionPerformed

    private void jRB11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_1ActionPerformed

    private void jRB11_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_2ActionPerformed

    private void jRB11_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB11_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB11_3ActionPerformed

    private void jRB12_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_1ActionPerformed

    private void jRB12_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_2ActionPerformed

    private void jRB12_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB12_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB12_3ActionPerformed

    private void jRB13_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_1ActionPerformed

    private void jRB13_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_2ActionPerformed

    private void jRB13_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB13_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB13_3ActionPerformed

    private void jRB14_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_1ActionPerformed

    private void jRB14_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_2ActionPerformed

    private void jRB14_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB14_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB14_3ActionPerformed

    private void jRB15_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_1ActionPerformed

    private void jRB15_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_2ActionPerformed

    private void jRB15_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB15_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB15_3ActionPerformed

    private void jRB16_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_1ActionPerformed

    private void jRB16_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_2ActionPerformed

    private void jRB16_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB16_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB16_3ActionPerformed

    private void jLabelNextArrow4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseClicked
        boolean choice_made = buttonGroup17.getSelection() != null && 
                buttonGroup8.getSelection() != null && 
                buttonGroup19.getSelection() != null && 
                buttonGroup20.getSelection() != null && 
                buttonGroup21.getSelection() != null && 
                buttonGroup22.getSelection() != null && 
                buttonGroup23.getSelection() != null && 
                buttonGroup24.getSelection() != null;
        
        if (choice_made == true){
            JTabbedNavigation.setSelectedIndex(13);
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s, please check again.","Incomplete Response",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelNextArrow4MouseClicked

    private void jLabelNextArrow4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseEntered
        jLabelNextArrow4.setBackground(new Color(245, 245, 245));
        jLabelNextArrow4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow4.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow4MouseEntered

    private void jLabelNextArrow4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow4MouseExited
        jLabelNextArrow4.setBackground(new Color(245, 245, 245));
        jLabelNextArrow4.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow4.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow4MouseExited

    private void jLabelNextArrow5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseClicked
        JTabbedNavigation.setSelectedIndex(12);
    }//GEN-LAST:event_jLabelNextArrow5MouseClicked

    private void jLabelNextArrow5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseEntered
        jLabelNextArrow5.setBackground(new Color(245, 245, 245));
        jLabelNextArrow5.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabelNextArrow5.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabelNextArrow5MouseEntered

    private void jLabelNextArrow5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow5MouseExited
        jLabelNextArrow5.setBackground(new Color(245, 245, 245));
        jLabelNextArrow5.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabelNextArrow5.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabelNextArrow5MouseExited

    private void jRB17_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_3ActionPerformed

    private void jRB17_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_1ActionPerformed

    private void jRB17_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB17_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB17_2ActionPerformed

    private void jRB18_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_1ActionPerformed

    private void jRB18_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_2ActionPerformed

    private void jRB18_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB18_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB18_3ActionPerformed

    private void jRB19_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_1ActionPerformed

    private void jRB19_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_2ActionPerformed

    private void jRB19_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB19_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB19_3ActionPerformed

    private void jRB20_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_1ActionPerformed

    private void jRB20_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_2ActionPerformed

    private void jRB20_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB20_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB20_3ActionPerformed

    private void jRB21_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_1ActionPerformed

    private void jRB21_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_2ActionPerformed

    private void jRB21_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB21_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB21_3ActionPerformed

    private void jRB22_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_1ActionPerformed

    private void jRB22_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_2ActionPerformed

    private void jRB22_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB22_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB22_3ActionPerformed

    private void jButtonRessultsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseEntered
        // TODO add your handling code here:
        jButtonRessults.setBackground(new java.awt.Color(102, 0, 0));
    }//GEN-LAST:event_jButtonRessultsMouseEntered

    private void jButtonRessultsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseExited
        // TODO add your handling code here:
        jButtonRessults.setBackground(new java.awt.Color(136,0,0));
    }//GEN-LAST:event_jButtonRessultsMouseExited

    private void jButtonRessultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRessultsActionPerformed
        
        
    
    }//GEN-LAST:event_jButtonRessultsActionPerformed
    private void ResetST (){ // This resets the choices in the S&T Evaluation
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       buttonGroup3.clearSelection();
       buttonGroup4.clearSelection();
       buttonGroup5.clearSelection();
       buttonGroup6.clearSelection();
       buttonGroup7.clearSelection();
       buttonGroup8.clearSelection();
       buttonGroup9.clearSelection();
       buttonGroup10.clearSelection();
       buttonGroup11.clearSelection();
       buttonGroup12.clearSelection();
       buttonGroup13.clearSelection();
       buttonGroup14.clearSelection();
       buttonGroup15.clearSelection();
       buttonGroup16.clearSelection();
       buttonGroup17.clearSelection();
       buttonGroup18.clearSelection();
       buttonGroup19.clearSelection();
       buttonGroup20.clearSelection();
       buttonGroup21.clearSelection();
       buttonGroup22.clearSelection();
       buttonGroup23.clearSelection();
       buttonGroup24.clearSelection();
       buttonGroup25.clearSelection();
       buttonGroup26.clearSelection();
       buttonGroup27.clearSelection();
       buttonGroup28.clearSelection();
       buttonGroup29.clearSelection();
       buttonGroup30.clearSelection();
     
       jTFFilipino.setText(null);
       jTFEnglish.setText(null);
       jTFGenAve.setText(null);
       jTFScience.setText(null);
       jTFMath.setText(null);
       jTFSports.setText(null);
       jTFTVL.setText(null);
       jTFAcademic.setText(null);
       jTFArts.setText(null);
       
       jCBAcadRating.setSelected(false);
       jCBNcae.setSelected(false);
    }
    private void jButtonRessultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRessultsMouseClicked
       // process first before resetting
        boolean choice_made = buttonGroup25.getSelection() != null && 
                buttonGroup26.getSelection() != null && 
                buttonGroup27.getSelection() != null && 
                buttonGroup28.getSelection() != null && 
                buttonGroup29.getSelection() != null && 
                buttonGroup30.getSelection() != null;
        
        if (choice_made == true){
            // set of points for Strand & Track
            int intTVL_score = 0, intACAD_score = 0, intSPORTS_score = 0, intARTS_score = 0;
            int intABM = 0, intSTEM = 0, intHUMMS = 0, intANIMATION = 0, intPERFORMING_ARTS = 0, intFILM_PRODUCTION = 0, intSPORTS_COACHING = 0, intSPORTS_OFFICIATING = 0, intHOME_ECONOMICS = 0, intICT = 0, intINDUSTRIAL = 0;


            //get grades and NCAE
            String filText = jTFFilipino.getText(), engText = jTFEnglish.getText(), genText = jTFGenAve.getText(), mathText = jTFMath.getText(), sciText = jTFScience.getText();
            String AcadText = jTFAcademic.getText(), SportsText = jTFSports.getText(), TVLText = jTFTVL.getText(), ArtsText = jTFArts.getText();
            
            //grades
            int intConvertFil = filText.isEmpty() ? 0 : Integer.parseInt(filText);
            int intConvertEng = engText.isEmpty() ? 0 : Integer.parseInt(engText);
            int intConvertGen = genText.isEmpty() ? 0 : Integer.parseInt(genText);
            int intConvertMath = mathText.isEmpty() ? 0 : Integer.parseInt(mathText);
            int intConvertSci = sciText.isEmpty() ? 0 : Integer.parseInt(sciText);
            
            //NCAE
            int intConvertAcads = AcadText.isEmpty() ? 0 : Integer.parseInt(AcadText);
            int intConvertSports = SportsText.isEmpty() ? 0 : Integer.parseInt(SportsText);
            int intConvertTVL = TVLText.isEmpty() ? 0 : Integer.parseInt(TVLText);
            int intConvertArts = ArtsText.isEmpty() ? 0 : Integer.parseInt(ArtsText);
            
            // Pointing System Begins for Grades & NCAE
            if (!jCBAcadRating.isSelected()){
                if (intConvertFil >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertEng >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertGen >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertMath >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
                if (intConvertSci >= 85){
                    intTVL_score += 1;
                    intACAD_score += 2;
                    intARTS_score += 1;
                    intSPORTS_score += 1;
                }
            }
            
            if (!jCBNcae.isSelected()){
                intACAD_score += intConvertAcads / 10;
                intTVL_score += intConvertSports / 10;
                intSPORTS_score += intConvertTVL / 10;
                intARTS_score += intConvertArts / 10;
            }
            
            // Pointing System Begins for Radio Buttons
            //#1
            if (jRBYes1.isSelected()){
                intACAD_score += 3;
                intARTS_score += 2;
                intTVL_score += 2;
            } else if (jRBNo1.isSelected()){
                intTVL_score += 3;
                intSPORTS_score += 2;
            }
            
            //#2
            if (jRBYes2.isSelected()){
                intTVL_score += 3;
                intACAD_score += 2;
            } else if (jRBNo2.isSelected()){
                intARTS_score += 2;
                intSPORTS_score += 2;
            }
            
            //#3
            if (jRBYes3.isSelected()){
                intTVL_score += 3;
                intACAD_score += 2;
            }
            
            //#4
            if (jRBYes4.isSelected()){
                intTVL_score += 2;
            }
            
            //#5
            if (jRBYes5.isSelected()){
                intACAD_score += 3;
                intARTS_score += 2;
                intTVL_score += 1;
                intSPORTS_score += 2;
            }
            
            //#6
            if (jRBYes6.isSelected()){
                intACAD_score += 2;
            }
            
            //#7
            if (jRBYes7.isSelected()){
                intARTS_score += 5;
            }
            
            //#8
            if (jRBYes8.isSelected()){
                intSPORTS_score += 3;
            }
            
            //#9
            if (jRB1_1.isSelected()){
                intABM += 3;
            } else if (jRB1_2.isSelected()){
                intABM += 9;
            } else if (jRB1_3.isSelected()){
                intABM += 15;
            }
                        
            //#10
            if (jRB2_1.isSelected()){
                intSTEM += 3;
            } else if (jRB2_2.isSelected()){
                intSTEM  += 9;
            } else if (jRB2_3.isSelected()){
                intSTEM  += 15;
            }
            
            //#11
            if (jRB3_1.isSelected()){
                intHUMMS += 3;
            } else if (jRB3_2.isSelected()){
                intHUMMS  += 9;
            } else if (jRB3_3.isSelected()){
                intHUMMS  += 15;
            }
            
            //#12
            if (jRB4_1.isSelected()){
                intANIMATION += 3;
            } else if (jRB4_2.isSelected()){
                intANIMATION  += 9;
            } else if (jRB4_3.isSelected()){
                intANIMATION  += 15;
            }
            
            //#13
            if (jRB5_1.isSelected()){
                intPERFORMING_ARTS += 3;
            } else if (jRB5_2.isSelected()){
                intPERFORMING_ARTS += 9;
            } else if (jRB5_3.isSelected()){
                intPERFORMING_ARTS  += 15;
            }
            
            //#14
            if (jRB6_1.isSelected()){
                intFILM_PRODUCTION += 3;
            } else if (jRB6_2.isSelected()){
                intFILM_PRODUCTION += 9;
            } else if (jRB6_3.isSelected()){
                intFILM_PRODUCTION  += 15;
            }
            
            //#15
            if (jRB7_1.isSelected()){
                intSPORTS_COACHING += 3;
            } else if (jRB7_2.isSelected()){
                intSPORTS_COACHING += 9;
            } else if (jRB7_3.isSelected()){
                intSPORTS_COACHING  += 15;
            }
            
            //#16
            if (jRB8_1.isSelected()){
                intSPORTS_OFFICIATING += 3;
            } else if (jRB8_2.isSelected()){
                intSPORTS_OFFICIATING += 9;
            } else if (jRB8_3.isSelected()){
                intSPORTS_OFFICIATING  += 15;
            }
            
            //----- HOME ECO
            //#17
            if (jRB9_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB9_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB9_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#18
            if (jRB10_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB10_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB10_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#19
            if (jRB11_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB11_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB11_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#20
            if (jRB12_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB12_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB12_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //#21
            if (jRB13_1.isSelected()){
                intHOME_ECONOMICS += 0;
            } else if (jRB13_2.isSelected()){
                intHOME_ECONOMICS += 1;
            } else if (jRB13_3.isSelected()){
                intHOME_ECONOMICS  += 3;
            }
            
            //---- ICT
            //#22
            if (jRB14_1.isSelected()){
                intICT += 1;
            } else if (jRB14_2.isSelected()){
                intICT += 3;
            } else if (jRB14_3.isSelected()){
                intICT  += 5;
            }
            
            //#23
            if (jRB15_1.isSelected()){
                intICT += 1;
            } else if (jRB15_2.isSelected()){
                intICT += 3;
            } else if (jRB15_3.isSelected()){
                intICT  += 5;
            }
            
            //#24
            if (jRB16_1.isSelected()){
                intICT += 1;
            } else if (jRB16_2.isSelected()){
                intICT += 3;
            } else if (jRB16_3.isSelected()){
                intICT  += 5;
            }
            
            // ---- INDUSTRIAL
            //#25
            if (jRB17_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB17_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB17_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#26
            if (jRB18_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB18_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB18_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#27
            if (jRB19_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB19_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB19_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#28
            if (jRB20_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB20_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB20_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#29
            if (jRB21_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB21_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB21_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            //#30
            if (jRB22_1.isSelected()){
                intINDUSTRIAL += 0;
            } else if (jRB22_2.isSelected()){
                intINDUSTRIAL += 1;
            } else if (jRB22_3.isSelected()){
                intINDUSTRIAL  += 3;
            }
            
            
            /* ----- BALANCING (when scores of strand match within the other, there will be an equally incrementation of scores)
                    intTVL_score += ;
                    intACAD_score += ;
                    intARTS_score += ;
                    intSPORTS_score += ;
            */
            
            if ((intACAD_score == intARTS_score) || (intACAD_score == intTVL_score) || (intACAD_score == intSPORTS_score)){
                intACAD_score += 3;
            }
            
            if ((intARTS_score == intTVL_score) || (intARTS_score == intSPORTS_score)){
                intARTS_score += 2;
            }
            
            if ((intTVL_score == intSPORTS_score)){
                intTVL_score += 1;
            }
            
            // RESULT VERFICATION & DISPLAYING
            String strResultStrand = "-", strResultTrack = "-";
            
            if ((intACAD_score > intARTS_score) && (intACAD_score > intTVL_score) && (intACAD_score > intSPORTS_score)){
                strResultTrack = "ACADEMIC TRACK";
                
                if (intABM > intSTEM && intABM > intHUMMS){
                    strResultStrand = "Accountancy, Business, and Management Strand";
                    intABM += 1;
                } else if (intABM == intSTEM){
                    strResultStrand = "Accountancy, Business, and Management Strand";
                    intABM += 1;
                } else if (intABM == intHUMMS){
                    strResultStrand = "Humanities and Social Science Strand";
                    intHUMMS += 1;
                } else if (intHUMMS == intSTEM){
                    strResultStrand = "Humanities and Social Science Strand";
                    intHUMMS += 1;
                }
                
                if (intSTEM > intABM && intSTEM > intHUMMS){
                    strResultStrand = "Science, Technology, Engineering and Mathematics Strand";
                }else if (intHUMMS > intABM && intHUMMS > intSTEM){
                    strResultStrand = "Humanities and Social Science Strand";
                }
                
            } else if ((intARTS_score > intACAD_score) && (intARTS_score > intTVL_score) && (intARTS_score > intSPORTS_score)){
                strResultTrack = "ARTS & DESIGN TRACK";
                
                if (intANIMATION > intFILM_PRODUCTION && intANIMATION > intPERFORMING_ARTS){
                    strResultStrand = "Animation Strand";
                } else if (intANIMATION == intFILM_PRODUCTION){
                    strResultStrand = "Animation Strand";
                    intANIMATION += 1;
                } else if (intFILM_PRODUCTION == intPERFORMING_ARTS){
                    strResultStrand = "Film Production Strand";
                    intFILM_PRODUCTION += 1;
                } else if (intPERFORMING_ARTS == intANIMATION){
                    strResultStrand = "Performing Arts Strand";
                    intPERFORMING_ARTS += 1;
                }
                
                if (intFILM_PRODUCTION > intANIMATION && intFILM_PRODUCTION > intPERFORMING_ARTS){
                    strResultStrand = "Film Production Strand";
                }
                if (intPERFORMING_ARTS > intANIMATION && intPERFORMING_ARTS > intFILM_PRODUCTION){
                    strResultStrand = "Performing Arts Strand";
                }
            } else if ((intTVL_score > intACAD_score) && (intTVL_score > intARTS_score) && (intTVL_score > intSPORTS_score)){
                strResultTrack = "TECHNICAL-VOCATIONAL-LIVELIHOOD TRACK";
                
                if (intHOME_ECONOMICS > intICT && intHOME_ECONOMICS > intINDUSTRIAL) {
                    strResultStrand = "Home Economics Strand";
                } else if (intHOME_ECONOMICS == intICT) {
                    strResultStrand = "Information and Communications Technology Strand";
                    intICT += 1;
                } else if (intICT == intINDUSTRIAL) {
                    strResultStrand = "Industrial Arts Strand";
                    intINDUSTRIAL += 1;
                } else if (intINDUSTRIAL == intHOME_ECONOMICS) {
                    strResultStrand = "Home Economics Strand";
                    intHOME_ECONOMICS += 1;
                }

                if (intICT > intHOME_ECONOMICS && intICT > intINDUSTRIAL) {
                    strResultStrand = "Information and Communications Technology Strand";
                }

                if (intINDUSTRIAL > intHOME_ECONOMICS && intINDUSTRIAL > intICT) {
                    strResultStrand = "Industrial Arts Strand";
                }
            } else if ((intSPORTS_score > intACAD_score) && (intSPORTS_score > intARTS_score) && (intSPORTS_score > intTVL_score)){
                strResultTrack = "SPORTS TRACK";
               
                if (intSPORTS_COACHING > intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Coaching Strand";
                } else if (intSPORTS_COACHING < intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Officiating Strand";
                } else if (intSPORTS_COACHING == intSPORTS_OFFICIATING){
                    strResultStrand = "Sports Officiating Strand";
                    intSPORTS_OFFICIATING += 1;
                }
            }
            //DISPLAY
            /* 
                    intTVL_score += ;
                    intACAD_score += ;
                    intARTS_score += ;
                    intSPORTS_score += ;
            */
            // FINAL RESULT
            jLabelResultStrand.setText(strResultStrand);
            jLabelResultTrack2.setText(strResultTrack);
            
            // MAIN TRACKS
            jLabelResultAcadTrack.setText(String.valueOf(intACAD_score));
            jLabelResultArtsTrack.setText(String.valueOf(intARTS_score));
            jLabelResultTVLTrack.setText(String.valueOf(intTVL_score));
            jLabelResultSportsTrack.setText(String.valueOf(intSPORTS_score));
            
            // ACADEMIC TRACK
            jLabelHUMMS.setText(String.valueOf(intHUMMS));
            jLabelSTEM.setText(String.valueOf(intSTEM));
            jLabelABM.setText(String.valueOf(intABM));
            
            // ARTS & DESIGN TRACK
            jLabelPERFORMING_ARTS.setText(String.valueOf(intPERFORMING_ARTS));
            jLabelFILM_PRODUCTION.setText(String.valueOf(intFILM_PRODUCTION));
            jLabelANIMATION.setText(String.valueOf(intANIMATION));
            
            // TVL TRACK
            jLabelHOME_ECONOMICS.setText(String.valueOf(intHOME_ECONOMICS));
            jLabelICT.setText(String.valueOf(intICT));
            jLabelINDUSTRIAL_ARTS.setText(String.valueOf(intINDUSTRIAL));
            
            // SPORTS TRACK
            jLabelSPORTS_COACHING.setText(String.valueOf(intSPORTS_COACHING));
            jLabelSPORTS_OFFICIATING.setText(String.valueOf(intSPORTS_OFFICIATING));
      
            // going to the RESULTS TAB & reseting choices
            JTabbedNavigation.setSelectedIndex(13);
            ResetST();
        } else{
            JOptionPane.showMessageDialog(this,"You have an Incomplete or Invalid Response/s, please check again.","Incomplete Response",JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jButtonRessultsMouseClicked

    private void jCBAcadRatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBAcadRatingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAcadRatingMouseClicked

    private void jLabelNextArrow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNextArrow1MouseClicked

    private void jLabelNextArrow1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNextArrow1MouseEntered

    private void jLabelNextArrow1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextArrow1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNextArrow1MouseExited

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        switch (jList1.getSelectedIndex()) {
            case 0:
            // hostel
            jFacility_PicHostel.setVisible(true);
            jTxtHolder3.setText("Description: A spacious 7-floor hostel that can accommodate four students per room.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;
            case 1:
            // mateo
            jFacility_PicMateo.setVisible(true);
            jFacility_PicHostel.setVisible(false);
            jTxtHolder3.setText("Description: Dr. Mateo Conference room is an executive conference room with strong internet connection that can handle small group face-to-face and online meetings.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;
            case 2:
            // olona
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(true);
            jTxtHolder3.setText("Description: Dr. Olonan and Dr. Carague Conference Rooms can handle small group face-to-face and online meetings.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;
            case 3:
            // football
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(true);
            jTxtHolder3.setText("Description: Dr. Olonan and Dr. Carague Conference Rooms can handle small group face-to-face and online meetings.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;
            case 4:
            // interfaith chapel
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(true);
            jTxtHolder3.setText("Description: The Interfaith Chapel for students and faculty members of different faiths.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 5:
            // medical clinic
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(true);
            jTxtHolder3.setText("Description: State-of-the-art medical and dental equipment that ensures safety of students and faculty members.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 6:
            // ninoy aquino library
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(true);
            jTxtHolder3.setText("Description: The University Librarry serves as the University's gateway to the global information society, and provides various services and development of programs to its clientele.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 7:
            // olympic sized swimming pool
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(true);
            jTxtHolder3.setText("Description: An olympic-sized swimming pool that is capable of handling several swimming classes and student athlete activities simultaneously.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 8:
            // outdoor gym
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(true);
            jTxtHolder3.setText("Description: Outdoor gym fit for basketball, tennis, and other Palarong Pambansa.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 9:
            // PUP-Lagoon
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(false);
            jFacility_PicLagoon.setVisible(true);
            jTxtHolder3.setText("Description: The Lagoon serves as one of the major facilities in the university, wherein food, rest and enjoyment can take place.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 10:
            // balagtas hall
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(false);
            jFacility_PicLagoon.setVisible(false);
            jFacility_PicBalagtas.setVisible(true);
            jTxtHolder3.setText("Description: The Balagtas Hall (Bulwagang Balagtas) has 800-seating capacity good for programs and events.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 11:
            // bookstore
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(false);
            jFacility_PicLagoon.setVisible(false);
            jFacility_PicBalagtas.setVisible(false);
            jFacility_PicBookstore.setVisible(true);
            jTxtHolder3.setText("Description: Books and instructional materials that passed the evaluation and have been approved for adoption and use in the University can be purchased from the bookstore");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 12:
            // canteen
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(false);
            jFacility_PicLagoon.setVisible(false);
            jFacility_PicBalagtas.setVisible(false);
            jFacility_PicBookstore.setVisible(false);
            jFacility_PicCanteen.setVisible(true);
            jTxtHolder3.setText("Description: An in-house canteen, coffee shop, and other food services from private concessionaires renting food stalls. The University Canteen offers take-out food services and reservation for events and meetings.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            case 13:
            // gym
            jFacility_PicMateo.setVisible(false);
            jFacility_PicHostel.setVisible(false);
            jFacility_PicOlonan.setVisible(false);
            jFacility_PicFootball.setVisible(false);
            jFacility_PicInterfaith.setVisible(false);
            jFacility_PicMedical.setVisible(false);
            jFacility_PicNinoyLibrary.setVisible(false);
            jFacility_PicSwimmingPool.setVisible(false);
            jFacility_PicOutdoorGym.setVisible(false);
            jFacility_PicLagoon.setVisible(false);
            jFacility_PicBalagtas.setVisible(false);
            jFacility_PicBookstore.setVisible(false);
            jFacility_PicCanteen.setVisible(false);
            jFacility_PicGym.setVisible(true);
            jTxtHolder3.setText("Description: The University Gymnasium serves as the training ground for the student athletes that participate in the intercollegiate sports program.");
            jTxtHolder2.setText("Location:\nNot Applicable yet");
            break;

            default:
            break;
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jBtnHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnHistoryMouseClicked
        jBtnHistory.setBackground(new java.awt.Color(136, 0, 0));
        jBtnHistory.setForeground(new Color(255, 255, 255));
        
        jBtnMission.setBackground(new java.awt.Color(255, 255, 255));
        jBtnMission.setForeground(new java.awt.Color(136, 0, 0));
        
        jBtnVision.setBackground(new java.awt.Color(255, 255, 255));
        jBtnVision.setForeground(new java.awt.Color(136, 0, 0));

        jTxtHolder.setText("------- History: 1904-1951 -----\n" +
            "\n" +
            "• 1904: Manila Business School (MBS) founded, offering vocational-technical courses and intermediate curriculum.\n" +
            "\n" +
            "• 1908: MBS renamed Philippine School of Commerce (PSC) due to focus on students from provinces. Four-year secondary course in commerce offered.\n" +
            "\n" +
            "• 1911: PSC placed under supervision of Superintendent of City Schools for administrative purposes, produces first batch of high school graduates.\n" +
            "\n" +
            "• 1912: One-year stenography course introduced and proves successful.\n" +
            "\n" +
            "• 1917: PSC revises courses and expands offerings, opens night classes (closed in 1932).\n" +
            "\n" +
            "• 1933: PSC merged with Philippine Normal School (PNS) and Philippine School of Arts and Trades, retains secondary curriculum.\n" +
            "\n" +
            "• 1940: President Manuel L. Quezon promises new building for PSC.\n" +
            "\n" +
            "• 1942: War disrupts PSC operations, school resumes after liberation in 1946.\n" +
            "\n" +
            "• 1947: PSC acquires Lepanto building in Sampaloc, Manila and officially moves there.\n" +
            "\n" +
            "• 1948: PSC acquires P.E. grounds in Sampaloc.\n" +
            "\n" +
            "• 1949: Teacher-training department established.\n" +
            "\n" +
            "• 1951: Three departments organized: Teacher Training, Business Education, and Research.\n" +
            "\n" +
            "----- History: 1952-1971-----\n" +
            "\n" +
            "• 1952: PSC becomes Philippine College of Commerce (PCC) under RA 778, broadens course offerings.\n" +
            "\n" +
            "• 1954: PCC celebrates Golden Jubilee.\n" +
            "\n" +
            "• 1955: PCC awarded \"Business College of the Year\" by Business Writers Association of the Philippines.\n" +
            "\n" +
            "• 1956: Prof. Pacifico A. Velilla takes over as PCC president.\n" +
            "\n" +
            "• 1962: Dr. Nemesio E. Prudente becomes president, establishes various initiatives.\n" +
            "\n" +
            "• 1963: College Code printed, Public Relations Program established, PCC Faculty Journal launched.\n" +
            "\n" +
            "• 1965: Pandacan site reserved for PCC, student assistantship program and financial aid introduced.\n" +
            "\n" +
            "• 1967: 10-hectare lot in Bicutan, Taguig reserved for PCC, student involvement policy adopted.\n" +
            "\n" +
            "• 1968: RA 6980 authorizes offering of social science courses, Sta. Mesa (A. Mabini) Campus assigned for PCC use.\n" +
            "\n" +
            "• 1969: President of Supreme Student Council becomes Board of Trustees member, Master of Arts and Master of Business Administration programs offered.\n" +
            "\n" +
            "• 1971: College Code revised, Laboratory High School transferred to A. Mabini Campus, Katipunan Foundation, Inc. created.\n" +
            "\n" +
            "----- History: 1972-1985 -----\n" +
            "\n" +
            "• 1972: Dr. Narciso Albaraccin, Jr. becomes OIC, introduces new courses, reorganizes faculties.\n" +
            "\n" +
            "• 1973: Dr. Isabelo T. Crisostomo becomes OIC, expands offerings, constructs gymnasium phase 1.\n" +
            "\n" +
            "• 1974: Bachelor of Business Administration and General Administration offered, various offices restructured.\n" +
            "\n" +
            "• 1975: PCC opens branch in Bataan Export Processing Zone (BEPZ), Mariveles, Bataan.\n" +
            "\n" +
            "• 1976: Faculty of Arts and Sciences (FAS) reestablished, graduate programs expanded.\n" +
            "\n" +
            "• 1977: Dr. Pablo T. Mateo becomes president, expands ladder program, introduces new courses.\n" +
            "\n" +
            "• 1978: PCC becomes Polytechnic University of the Philippines (PUP) through PD 1341, course offerings and administrative organization restructured.\n" +
            "\n" +
            "• 1979: Main library, university canteen, ecumenical chapel, and parts of PUP-Main Academic Building constructed, branch established in Lopez, Quezon.\n" +
            "\n" +
            "• 1983: Despite economic difficulties, PUP maintains 71 ladderized technical and professional programs, introduces Bachelor of Human Behavior Technology, includes computers in all degree programs, revives PUP Student Council.\n" +
            "\n" +
            "• 1984: University reorganized into \"cluster colleges\", University Center for Technological Research established, PUP partners with various agencies for training programs.\n" +
            "\n" +
            "----- History: 1986 - 2010 -----\n" +
            "\n" +
            "• 1986: Dr. Nemesio E. Prudente retakes presidency, focuses on education as equalizing factor, restructures University.\n" +
            "\n" +
            "• 1991-1999 - Period of continuous change with the appointment of the first lady president, Dr. Zenaida A. Olonan, and various initiatives.\n" +
            "\n" +
            "• 1999 - PUP celebrated its 95th Foundation Anniversary and underwent infrastructure projects, including the construction of the PUPWebSite.\n" +
            "\n" +
            "• 2000 - PUP became a Center of Development for Excellence in Information Technology, and the PUP ICT Center started operations.\n" +
            "\n" +
            "• 2001 - PUP achieved significant infrastructure developments, accreditation success, and student achievements.\n" +
            "\n" +
            "• 2003 - Dr. Ofelia M. Carague completed her term as President, and Dr. Samuel M. Salvador was designated Officer-in-Charge.\n" +
            "\n" +
            "• 2004 - PUP underwent various developments, including the establishment of the Research Center for Peace, Justice, and Democracy.\n" +
            "\n" +
            "• 2005 - Dr. Dante G. Guevarra was appointed Officer-in-Charge, and PUP celebrated its 101st Founding Anniversary.\n" +
            "\n" +
            "• 2006 - PUP participated in DOST's Technology Innovation for Commercialization Program and launched PUPCET iApply.\n" +
            "\n" +
            "• 2007 - PUP won awards in documentary competitions, became Southeast Asia's first Railway Academy, and launched PUP iText.\n" +
            "\n" +
            "• 2008 - PUP held an energy fair, became the permanent home of the Mabini Shrine, and partnered with Beijing Hangweili Educational Technology.\n" +
            "\n" +
            "• 2009 - PUP led in distance education studies, partnered with SMART Communications for PUP iText, and won the 1st College Debate Contest on Democracy.\n" +
            "\n" +
            "• 2010 - PUP was declared the permanent home of the Mabini Shrine, partnered with Jollibee for ACE scholarship, and conducted the 1st Gat Apolinario Mabini Awards.\n" +
            "\n" +
            "• 2011 - PUP won the PANAF Merit Award in IMC Youth Congress Competition, and the Bachelor in Transportation Management students won the DSFL Interschool Quiz Bee Competition.");
        jTxtHolder.setCaretPosition(0);
    }//GEN-LAST:event_jBtnHistoryMouseClicked

    private void jBtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnHistoryActionPerformed

    private void jBtnMissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnMissionMouseClicked
        jBtnMission.setBackground(new java.awt.Color(136, 0, 0));
        jBtnMission.setForeground(new Color(255, 255, 255));
        
        jBtnHistory.setBackground(new java.awt.Color(255, 255, 255));
        jBtnHistory.setForeground(new java.awt.Color(136, 0, 0));
        
        jBtnVision.setBackground(new java.awt.Color(255, 255, 255));
        jBtnVision.setForeground(new java.awt.Color(136, 0, 0));

        jTxtHolder.setText("Ensuring inclusive and equitable quality education and promoting lifelong learning opportunities through a re-engineered polytechnic university by committing to:"
            + "\n\n• provide democratized access to educational opportunities for the holistic development of individuals with global perspective\n" +
            "\n• offer industry-oriented curricula that produce highly-skilled professionals with managerial and technical capabilities and a strong sense of public service for nation building\n" +
            "\n• embed a culture of research and innovation\n" +
            "\n• continuously develop faculty and employees with the highest level of professionalism\n" +
            "\n• engage public and private institutions and other stakeholders for the attainment of social development goal\n" +
            "\n• establish a strong presence and impact in the international academic community");
        jTxtHolder.setCaretPosition(0);
    }//GEN-LAST:event_jBtnMissionMouseClicked

    private void jBtnMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnMissionActionPerformed

    private void jBtnVisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnVisionMouseClicked
        jBtnVision.setBackground(new java.awt.Color(136, 0, 0));
        jBtnVision.setForeground(new Color(255, 255, 255));
        
        jBtnHistory.setBackground(new java.awt.Color(255, 255, 255));
        jBtnHistory.setForeground(new java.awt.Color(136, 0, 0));
        
        jBtnMission.setBackground(new java.awt.Color(255, 255, 255));
        jBtnMission.setForeground(new java.awt.Color(136, 0, 0));

        jTxtHolder.setText("\"PUP: The National Polytechnic University\" or \"PUP: Pambansang Politeknikong Unibersidad.\" \n" +
            "------------------------------------------------------------------------------------------------------\n" +
            "\n" +
            "This vision statement emphasizes the university's aspiration to be a premier institution for polytechnic education in the Philippines. It reflects a commitment to providing high-quality technical and vocational education, nurturing well-rounded professionals, and contributing significantly to national development.");
        jTxtHolder.setCaretPosition(0);
    }//GEN-LAST:event_jBtnVisionMouseClicked

    private void jBtnVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnVisionActionPerformed

    private void jBtnScholarshipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnScholarshipMouseClicked
        jBtnCollege.setBackground(new java.awt.Color(219, 166, 37));
        jBtnSHS.setBackground(new java.awt.Color(219, 166, 37));
        jBtnScholarship.setBackground(new java.awt.Color(136, 0, 0));
        ContentAdmissionScholarship();
    }//GEN-LAST:event_jBtnScholarshipMouseClicked

    private void jBtnScholarshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnScholarshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnScholarshipActionPerformed

    private void jBtnCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCollegeMouseClicked
        jBtnCollege.setBackground(new java.awt.Color(136, 0, 0));
        jBtnSHS.setBackground(new java.awt.Color(219, 166, 37));
        jBtnScholarship.setBackground(new java.awt.Color(219, 166, 37));
        ContentAdmission();
    }//GEN-LAST:event_jBtnCollegeMouseClicked

    private void jBtnCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCollegeActionPerformed

    private void jBtnSHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSHSMouseClicked
        jBtnCollege.setBackground(new java.awt.Color(219, 166, 37));
        jBtnSHS.setBackground(new java.awt.Color(136, 0, 0));
        jBtnScholarship.setBackground(new java.awt.Color(219, 166, 37));
        ContentAdmissionSHS();
    }//GEN-LAST:event_jBtnSHSMouseClicked

    private void jBtnSHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSHSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSHSActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ThePUPOfficial").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        // TODO add your handling code here:
        https://www.linkedin.com/school/polytechnic-university-of-the-philippines/
        try {
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/school/polytechnic-university-of-the-philippines/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ThePUPOfficial").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://twitter.com/ThePUPOfficial").toURI());
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        switch(jList2.getSelectedIndex()) {
            case 0:
                jCaf.setVisible(true);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("5/F Dome PUP Main Building, A. Mabini Campus, Anonas St., Sta. Mesa, Manila 1016");
                break;
            case 1:
                jCaf.setVisible(false);
                jCadbe.setVisible(true);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("Formerly the College of Architecture and Fine Arts (CAFA), College of Engineering and Architecture Bldg., NDC Compound, Anonas cor Pureza Sts., Sta. Mesa, Manila 1016");
                break;
            case 2:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(true);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("6/F Room 601, South Wing Main Building, A. Mabini Campus, Sta. Mesa, Manila 1016");
                break;
            case 3:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(true);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("2/F North Wing Main Building, A. Mabini Campus, Sta. Mesa, Manila 1016");
                break;
            case 4:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(true);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("COC Building, NDC Compound, Anonas St., Sta. Mesa, Manila 1016");
                break;
            case 5:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(true);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("2/F North Wing (N-207) Main Building, A. Mabini Campus, Sta. Mesa, Manila 1016");
                break;
            case 6:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(true);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("2/F North Wing (N-205) Main Building, A. Mabini Campus, Sta. Mesa, Manila 1016");
                break;
            case 7:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(true);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("TBA");
                break;
            case 8:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(true);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("TBA");
                break;
            case 9:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(true);
                jCssd.setVisible(false);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("TBA");
                break;
            case 10:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(true);
                jCthtm.setVisible(false);
                
                jTextDesc.setText("");
                jTextLocation.setText("TBA");
                break;
            case 11:
                jCaf.setVisible(false);
                jCadbe.setVisible(false);
                jCal.setVisible(false);
                jCba.setVisible(false);
                jCoc.setVisible(false);
                jCcis.setVisible(false);
                jCoed.setVisible(false);
                jCe.setVisible(false);
                jChk.setVisible(false);
                jCpspa.setVisible(false);
                jCssd.setVisible(false);
                jCthtm.setVisible(true);
                
                jTextDesc.setText("");
                jTextLocation.setText("TBA");
                break;
        }   
    }//GEN-LAST:event_jList2ValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedNavigation;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jBtnCollege;
    private javax.swing.JButton jBtnHistory;
    private javax.swing.JButton jBtnMission;
    private javax.swing.JButton jBtnSHS;
    private javax.swing.JButton jBtnScholarship;
    private javax.swing.JButton jBtnVision;
    private javax.swing.JButton jButtonRessults;
    private javax.swing.JCheckBox jCBAcadRating;
    private javax.swing.JCheckBox jCBNcae;
    private javax.swing.JLabel jCadbe;
    private javax.swing.JLabel jCaf;
    private javax.swing.JLabel jCal;
    private javax.swing.JLabel jCba;
    private javax.swing.JLabel jCcis;
    private javax.swing.JLabel jCe;
    private javax.swing.JLabel jChk;
    private javax.swing.JLabel jCoc;
    private javax.swing.JLabel jCoed;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jCpspa;
    private javax.swing.JLabel jCs;
    private javax.swing.JLabel jCssd;
    private javax.swing.JLabel jCthtm;
    private javax.swing.JLabel jFacility_PicBalagtas;
    private javax.swing.JLabel jFacility_PicBookstore;
    private javax.swing.JLabel jFacility_PicCanteen;
    private javax.swing.JLabel jFacility_PicFootball;
    private javax.swing.JLabel jFacility_PicGym;
    private javax.swing.JLabel jFacility_PicHostel;
    private javax.swing.JLabel jFacility_PicInterfaith;
    private javax.swing.JLabel jFacility_PicLagoon;
    private javax.swing.JLabel jFacility_PicMateo;
    private javax.swing.JLabel jFacility_PicMedical;
    private javax.swing.JLabel jFacility_PicNinoyLibrary;
    private javax.swing.JLabel jFacility_PicOlonan;
    private javax.swing.JLabel jFacility_PicOutdoorGym;
    private javax.swing.JLabel jFacility_PicSwimmingPool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelABM;
    private javax.swing.JLabel jLabelANIMATION;
    private javax.swing.JLabel jLabelBackArrow1;
    private javax.swing.JLabel jLabelFILM_PRODUCTION;
    private javax.swing.JLabel jLabelHOME_ECONOMICS;
    private javax.swing.JLabel jLabelHUMMS;
    private javax.swing.JLabel jLabelICT;
    private javax.swing.JLabel jLabelINDUSTRIAL_ARTS;
    private javax.swing.JLabel jLabelNextArrow;
    private javax.swing.JLabel jLabelNextArrow1;
    private javax.swing.JLabel jLabelNextArrow3;
    private javax.swing.JLabel jLabelNextArrow4;
    private javax.swing.JLabel jLabelNextArrow5;
    private javax.swing.JLabel jLabelPERFORMING_ARTS;
    private javax.swing.JPanel jLabelPERFORMING_ARTS22;
    private javax.swing.JLabel jLabelResultAcadTrack;
    private javax.swing.JLabel jLabelResultArtsTrack;
    private javax.swing.JLabel jLabelResultSportsTrack;
    private javax.swing.JLabel jLabelResultStrand;
    private javax.swing.JLabel jLabelResultTVLTrack;
    private javax.swing.JLabel jLabelResultTrack2;
    private javax.swing.JLabel jLabelSPORTS_COACHING;
    private javax.swing.JLabel jLabelSPORTS_OFFICIATING;
    private javax.swing.JLabel jLabelSTEM;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAchievement;
    private javax.swing.JPanel jPanelAdmission;
    private javax.swing.JPanel jPanelClubs;
    private javax.swing.JPanel jPanelColleges;
    private javax.swing.JPanel jPanelFacilities;
    private javax.swing.JPanel jPanelFunFacts;
    private javax.swing.JPanel jPanelHMV;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelSTEvaluation;
    private javax.swing.JPanel jPanelSTEvaluation_1;
    private javax.swing.JPanel jPanelSTEvaluation_2;
    private javax.swing.JPanel jPanelSTEvaluation_3;
    private javax.swing.JPanel jPanelSTEvaluation_4;
    private javax.swing.JRadioButton jRB10_1;
    private javax.swing.JRadioButton jRB10_2;
    private javax.swing.JRadioButton jRB10_3;
    private javax.swing.JRadioButton jRB11_1;
    private javax.swing.JRadioButton jRB11_2;
    private javax.swing.JRadioButton jRB11_3;
    private javax.swing.JRadioButton jRB12_1;
    private javax.swing.JRadioButton jRB12_2;
    private javax.swing.JRadioButton jRB12_3;
    private javax.swing.JRadioButton jRB13_1;
    private javax.swing.JRadioButton jRB13_2;
    private javax.swing.JRadioButton jRB13_3;
    private javax.swing.JRadioButton jRB14_1;
    private javax.swing.JRadioButton jRB14_2;
    private javax.swing.JRadioButton jRB14_3;
    private javax.swing.JRadioButton jRB15_1;
    private javax.swing.JRadioButton jRB15_2;
    private javax.swing.JRadioButton jRB15_3;
    private javax.swing.JRadioButton jRB16_1;
    private javax.swing.JRadioButton jRB16_2;
    private javax.swing.JRadioButton jRB16_3;
    private javax.swing.JRadioButton jRB17_1;
    private javax.swing.JRadioButton jRB17_2;
    private javax.swing.JRadioButton jRB17_3;
    private javax.swing.JRadioButton jRB18_1;
    private javax.swing.JRadioButton jRB18_2;
    private javax.swing.JRadioButton jRB18_3;
    private javax.swing.JRadioButton jRB19_1;
    private javax.swing.JRadioButton jRB19_2;
    private javax.swing.JRadioButton jRB19_3;
    private javax.swing.JRadioButton jRB1_1;
    private javax.swing.JRadioButton jRB1_2;
    private javax.swing.JRadioButton jRB1_3;
    private javax.swing.JRadioButton jRB20_1;
    private javax.swing.JRadioButton jRB20_2;
    private javax.swing.JRadioButton jRB20_3;
    private javax.swing.JRadioButton jRB21_1;
    private javax.swing.JRadioButton jRB21_2;
    private javax.swing.JRadioButton jRB21_3;
    private javax.swing.JRadioButton jRB22_1;
    private javax.swing.JRadioButton jRB22_2;
    private javax.swing.JRadioButton jRB22_3;
    private javax.swing.JRadioButton jRB2_1;
    private javax.swing.JRadioButton jRB2_2;
    private javax.swing.JRadioButton jRB2_3;
    private javax.swing.JRadioButton jRB3_1;
    private javax.swing.JRadioButton jRB3_2;
    private javax.swing.JRadioButton jRB3_3;
    private javax.swing.JRadioButton jRB4_1;
    private javax.swing.JRadioButton jRB4_2;
    private javax.swing.JRadioButton jRB4_3;
    private javax.swing.JRadioButton jRB5_1;
    private javax.swing.JRadioButton jRB5_2;
    private javax.swing.JRadioButton jRB5_3;
    private javax.swing.JRadioButton jRB6_1;
    private javax.swing.JRadioButton jRB6_2;
    private javax.swing.JRadioButton jRB6_3;
    private javax.swing.JRadioButton jRB7_1;
    private javax.swing.JRadioButton jRB7_2;
    private javax.swing.JRadioButton jRB7_3;
    private javax.swing.JRadioButton jRB8_1;
    private javax.swing.JRadioButton jRB8_2;
    private javax.swing.JRadioButton jRB8_3;
    private javax.swing.JRadioButton jRB9_1;
    private javax.swing.JRadioButton jRB9_2;
    private javax.swing.JRadioButton jRB9_3;
    private javax.swing.JRadioButton jRBNo1;
    private javax.swing.JRadioButton jRBNo2;
    private javax.swing.JRadioButton jRBNo3;
    private javax.swing.JRadioButton jRBNo4;
    private javax.swing.JRadioButton jRBNo5;
    private javax.swing.JRadioButton jRBNo6;
    private javax.swing.JRadioButton jRBNo7;
    private javax.swing.JRadioButton jRBNo8;
    private javax.swing.JRadioButton jRBYes1;
    private javax.swing.JRadioButton jRBYes2;
    private javax.swing.JRadioButton jRBYes3;
    private javax.swing.JRadioButton jRBYes4;
    private javax.swing.JRadioButton jRBYes5;
    private javax.swing.JRadioButton jRBYes6;
    private javax.swing.JRadioButton jRBYes7;
    private javax.swing.JRadioButton jRBYes8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTFAcademic;
    private javax.swing.JTextField jTFArts;
    private javax.swing.JTextField jTFEnglish;
    private javax.swing.JTextField jTFFilipino;
    private javax.swing.JTextField jTFGenAve;
    private javax.swing.JTextField jTFMath;
    private javax.swing.JTextField jTFScience;
    private javax.swing.JTextField jTFSports;
    private javax.swing.JTextField jTFTVL;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextArea jTextLocation;
    private javax.swing.JTextArea jTxtHolder;
    private javax.swing.JTextArea jTxtHolder1;
    private javax.swing.JTextArea jTxtHolder2;
    private javax.swing.JTextArea jTxtHolder3;
    private javax.swing.JTextArea jTxtHolder4;
    // End of variables declaration//GEN-END:variables
}
