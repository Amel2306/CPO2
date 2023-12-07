class Celsius:
    
    def __init__(self, temperature=0):
        self.temperature = temperature # appel au setter
    def to_fahrenheit(self):
        return (self.temperature * 1.8) + 32 # appel au getter
    @property       # c-à-d temperature = property(temperature)
    def temperature(self):            # getter
        print("Getting temperature…") ; return self._temperature
    @temperature.setter 
    def temperature(self, value):     # setter
        print("Setting temperature…")
        if value < -273.15:
            raise ValueError("Temp. below -273.15 is not possible")
        self._temperature = value
        
        
c = Celsius(10)
 
print (c._temperature)
c._temperature = -1000
print(c._temperature)

