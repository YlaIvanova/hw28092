public class Main {
    public static void main(String[] args) {

        Amphibians frog = new Amphibians("Лягушка",2,"болото");
        Amphibians alreadyFreshwater = new Amphibians(" Уж пресноводный",3," река");
        Flightless peacock = new Flightless("Павлин","зоопарк","ходит");
        Flightless penguin = new Flightless("Пингвин","прибрежные воды Антарктики","плавает");
        Flightless dodoBird = new Flightless("Птица Додо","лес","ходит");
        Flying seagull = new Flying("Чайка",2,"море","летает");
        Flying albatross = new Flying("Альбатрос",3,"море","летает");
        Flying falcon = new Flying("Сокол",1,"тундра","летает");
        Herbivores gazelle = new Herbivores("Газель",5,"пустыня",50,"трава и листья");
        Herbivores giraffe = new Herbivores("Жираф",7,"тропическая степь",55,"трава и акации");
        Herbivores horse = new Herbivores("Лошадь",10,"луг",60,"сено");
        Predators hyena = new Predators("Гиена",8,"Африка",55,"падалью");
        Predators tiger = new Predators("Тигр",12,"тропические леса",65,"мясо");
        Predators bear = new Predators("Медведь",5,"северные леса",60,"мясо и ягоды");


        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

    }
}