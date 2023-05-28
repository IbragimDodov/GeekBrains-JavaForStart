package FinalProject;

// Создать класс Ноутбук для магазина техники.
// Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.

// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук

// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
// Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - RAM
// 2 - Объем HD
// 3 - Операционная система
// 4 - Цвет …

// Для критериев объем и память необходимо запросить дополнительно диапазон.
// Например,
// "Введите минимальное значение"
// "Введите максимальное значение"

// Отфильтровать ноутбуки и вывести проходящие по критерию.
// Пример вывода:

// Ноутбуки с объем HD от 256 до 512
// 1 HP EliteBook...
// 2..
// 3...

// Пример вывода:

// Ноутбуки с цвет Серебристый
// 1 Honor ...
// 2..
// 3...

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Set<NoteBook> noteBookSet = GetData();
        for (NoteBook noteBook : noteBookSet) {
            System.out.println(noteBook);
        }

        Map<NoteBook.FilterCriteria, Object> filter = CreateFilterCriteria();
        System.out.println("Фильтр по критериям: " + filter);
        Set<NoteBook> filteredNoteBook = new TreeSet<>();
        for (NoteBook noteBook : noteBookSet)
            if(noteBook.CheckCriteria(filter))
                filteredNoteBook.add(noteBook);
        if(!filteredNoteBook.isEmpty())
            for (NoteBook noteBook : filteredNoteBook)
                System.out.println(noteBook);
        else
            System.out.println("Ничего не найдено.");
    }

    public static Set<NoteBook> GetData() {
        Set<NoteBook> noteBookSet = new TreeSet<>();
        noteBookSet.add(new NoteBook(
                "HYM-W56 5301ABCM",
                "HONOR",
                "MagicBook 16",
                "darkgrey",
                "Windows 11",
                new Display(16.1, 1920, 1080),
                new CPU("AMD", "Ryzen 5 5600H", 6, 12, 3300),
                new RAM(RAM.RAMType.DDR4, 16, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));

        noteBookSet.add(new NoteBook(
                "81WQ0059RE",
                "Lenovo",
                "IdeaPad 3 15IGL05",
                "black",
                "none",
                new Display(15.6, 1920, 1680),
                new CPU("Intel", "Celeron N4020", 2, 2, 1100),
                new RAM(RAM.RAMType.DDR4, 4, 2666),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 256)
        ));
        noteBookSet.add(new NoteBook(
                "G513IH-HN014",
                "ASUS",
                "ROG Strix G15",
                "darkgrey",
                "none",
                new Display(15.6, 1920, 1080),
                new CPU("AMD", "Ryzen 7 4800H", 8, 16, 2900),
                new RAM(RAM.RAMType.DDR4, 16, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));
        noteBookSet.add(new NoteBook(
                "3A5H4EA",
                "HP",
                "ProBook 455 G8",
                "silver",
                "none",
                new Display(15.6, 1920, 1680),
                new CPU("AMD", "Ryzen 7 5800U", 8, 16, 1900),
                new RAM(RAM.RAMType.DDR4, 16, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));
        noteBookSet.add(new NoteBook(
                "JYU4203CN",
                "Xiaomi",
                "RedmiBook 14",
                "silver",
                "none",
                new Display(14.0, 1920, 1080),
                new CPU("Intel", "Core i3 8145U", 8, 16, 2900),
                new RAM(RAM.RAMType.DDR4, 16, 2400),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.SATA3, 256)
        ));
        noteBookSet.add(new NoteBook(
                "G713IH-HX007",
                "ASUS",
                "ROG Strix G17",
                "darkgrey",
                "none",
                new Display(17.3, 1920, 1080),
                new CPU("AMD", "AMD Ryzen 7 4800H", 8, 16, 2900),
                new RAM(RAM.RAMType.DDR4, 16, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));
        noteBookSet.add(new NoteBook(
                "82H8005KRK",
                "Lenovo",
                "IdeaPad 3 15ITL6",
                "gray",
                "none",
                new Display(15.6, 1920, 1680),
                new CPU("Intel", "Core i5 1135G7", 4, 8, 2400),
                new RAM(RAM.RAMType.DDR4, 8, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));

        noteBookSet.add(new NoteBook(
                "MGN63",
                "Apple",
                "Macbook Air 13\" M1 2020",
                "gray",
                "Mac OS",
                new Display(13.3, 2560, 1600),
                new CPU("Apple", "M1", 8, 8, 3200),
                new RAM(RAM.RAMType.DDR3, 8, 2133),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 256)
        ));

        noteBookSet.add(new NoteBook(
                "G513IC-HN003",
                "ASUS",
                "ROG Strix G15",
                "darkgrey",
                "none",
                new Display(15.6, 1920, 1080),
                new CPU("AMD", "Ryzen 7 4800H", 8, 16, 2900),
                new RAM(RAM.RAMType.DDR4, 16, 3200),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));
        noteBookSet.add(new NoteBook(
                "3500-5667",
                "Dell",
                "Vostro 15 3500",
                "darkgrey",
                "Linux",
                new Display(15.6, 1920, 1080),
                new CPU("Intel", "Core i3 1115G4", 2, 4, 3000),
                new RAM(RAM.RAMType.DDR4, 4, 2666),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 256)
        ));

        noteBookSet.add(new NoteBook(
                "UX425EA-KI880",
                "ASUS",
                "ZenBook 14",
                "purple",
                "none",
                new Display(14.0, 1920, 1080),
                new CPU("Intel", "Core i5 1135G7", 4, 8, 2400),
                new RAM(RAM.RAMType.DDR4, 16, 4266),
                new Storage(Storage.StorageType.SDD, Storage.InterfaceType.PCIe, 512)
        ));

        return noteBookSet;
    }

    public static Map<NoteBook.FilterCriteria, Object> CreateFilterCriteria(){
        Scanner scanner = new Scanner(System.in);
        Map<NoteBook.FilterCriteria, Object> criteria = new HashMap<>();

        while(true) {
            System.out.println("Добавлены критерии: " + criteria);
            PrintMenu();
            System.out.print("> ");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 0:
                    scanner.close();
                    return criteria;
                case 1:
                    System.out.print("Введите производителя > ");
                    criteria.put(NoteBook.FilterCriteria.VENDOR, scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Введите цвет > ");
                    criteria.put(NoteBook.FilterCriteria.COLOR, scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Введите операционнцю систему > ");
                    criteria.put(NoteBook.FilterCriteria.OS, scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Введите минимальную частоту процессора в мегегерцах > ");
                    criteria.put(NoteBook.FilterCriteria.CPU_SPEED, scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Введите минимальный объем оперативной памяти в гигабайтах > ");
                    criteria.put(NoteBook.FilterCriteria.RAM, scanner.nextInt());
                    break;
                case 6:
                    System.out.print("Введите минимальную ёмкость накопителя > ");
                    criteria.put(NoteBook.FilterCriteria.STORAGE, scanner.nextInt());
                    break;
                default:
                    break;
            }
        }

    }

    public static void PrintMenu() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Цвет");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Минимальная частота процессора");
        System.out.println("5 - Минимальный объем оперативной памяти");
        System.out.println("6 - Минимальная емкость накопителя");
        System.out.println("0 - Хватит");
    }


}
