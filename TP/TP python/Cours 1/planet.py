from enum import Enum


class TempUnit(Enum):
    K = "Kelvin"
    C = "Celsius"
    F = "Fahrenheit"

    def getTempUnitSymbol(self: "TempUnit") -> str:
        if self == TempUnit.K:
            return "K"
        elif self == TempUnit.C:
            return "°C"
        elif self == TempUnit.F:
            return "°F"
        else:
            return "°K"


class Planet:
    def __init__(
        self,
        nom: str,
        coords: float,
        temp: float,
        tempUnit: TempUnit = TempUnit.K,
    ):
        self.nom = nom
        self.coords = coords
        self.temp = temp
        self.tempUnit = tempUnit

    def __str__(self: "Planet") -> str:
        return (
            "Nom: "
            + self.nom
            + " | Coords: "
            + str(self.coords)
            + " parsecs | Temp: "
            + str(self.temp)
            + " "
            + self.tempUnit.getTempUnitSymbol()
        )


def main():
    planet = Planet("Terre", 1.0, 15.0, TempUnit.C)
    print(planet)
    planet2 = Planet("Mars", 1.5, 0.0)
    print(planet2)


if __name__ == "__main__":
    main()