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
        self.__nom = nom
        self.__coords = coords
        self.__temp = temp
        self.__tempUnit = tempUnit

    @property 
    def nom(self) :
        return self.__nom
    
    @nom.setter 
    def nom(self, value) :
        self.__nom = value
        
    @property 
    def coords(self) :
        return self.__coords
    
    @coords.setter 
    def coords(self, value) :
        self.__coords = value

    @property 
    def temp(self) :
        return self.__temp
    
    @temp.setter 
    def temp(self, value) :
        self.__temp = value

    @property 
    def tempUnit(self) :
        return self.__tempUnit
    
    @tempUnit.setter 
    def tempUnit(self, value) :
        self.__tempUnit = value
    
    def __str__(self) -> str:
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

    @classmethod
    def from_kelvin_to_celsius(cls, kelvin):
        return kelvin - 273.15
    
    

def main():
    planet = Planet("Terre", 1.0, 15.0, TempUnit.C)
    print(planet)
    planet2 = Planet("Mars", 1.5, 0.0)
    print(planet2)


if __name__ == "__main__":
    main()